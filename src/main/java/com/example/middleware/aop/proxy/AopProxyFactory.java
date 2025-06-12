package com.example.middleware.aop.proxy;

import com.example.middleware.aop.annotation.*;
import com.example.middleware.aop.core.AspectScanner;
import com.example.middleware.aop.util.ClassUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class AopProxyFactory {
    private static final Logger log = LoggerFactory.getLogger(AopProxyFactory.class);
    private static final Map<Class<?>, Object> PROXY_CACHE = new ConcurrentHashMap<>();

    @SuppressWarnings("unchecked")
    public static <T> T createProxy(Class<T> interfaceClass, String aspectBasePackage) {
        return (T) PROXY_CACHE.computeIfAbsent(interfaceClass,
                k -> createProxyInternal(interfaceClass, aspectBasePackage));
    }

    private static Object createProxyInternal(Class<?> interfaceClass, String aspectBasePackage) {
        try {
            Class<?> implClass = ClassUtils.findImplementationClass(interfaceClass);
            if (implClass == null)
                throw new IllegalStateException("No implementation found for " + interfaceClass.getName());
            Object target = implClass.getDeclaredConstructor().newInstance();
            List<Object> aspects = AspectScanner.scanAspects(aspectBasePackage);
            return Proxy.newProxyInstance(
                    interfaceClass.getClassLoader(),
                    new Class<?>[] { interfaceClass },
                    new AopInvocationHandler(target, aspects));
        } catch (Exception e) {
            log.error("创建代理失败", e);
            throw new RuntimeException(e);
        }
    }

    private static class AopInvocationHandler implements InvocationHandler {
        private final Object target;
        private final List<Object> aspects;

        public AopInvocationHandler(Object target, List<Object> aspects) {
            this.target = target;
            this.aspects = aspects;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            // 前置通知
            for (Object aspect : aspects) {
                for (Method advice : aspect.getClass().getDeclaredMethods()) {
                    Before before = advice.getAnnotation(Before.class);
                    if (before != null && matches(method, before.value())) {
                        advice.setAccessible(true);
                        advice.invoke(aspect);
                    }
                }
            }
            Object result = null;
            Throwable throwable = null;
            try {
                result = method.invoke(target, args);
            } catch (Throwable ex) {
                throwable = ex.getCause() != null ? ex.getCause() : ex;
                // 异常通知
                for (Object aspect : aspects) {
                    for (Method advice : aspect.getClass().getDeclaredMethods()) {
                        AfterThrowing afterThrowing = advice.getAnnotation(AfterThrowing.class);
                        if (afterThrowing != null && matches(method, afterThrowing.value())) {
                            advice.setAccessible(true);
                            advice.invoke(aspect, throwable);
                        }
                    }
                }
                throw throwable;
            }
            // 后置通知
            for (Object aspect : aspects) {
                for (Method advice : aspect.getClass().getDeclaredMethods()) {
                    After after = advice.getAnnotation(After.class);
                    if (after != null && matches(method, after.value())) {
                        advice.setAccessible(true);
                        advice.invoke(aspect);
                    }
                }
            }
            return result;
        }

        private boolean matches(Method method, String pointcut) {
            // 简单实现：pointcut 直接匹配方法名
            return method.getName().equals(pointcut);
        }
    }
}