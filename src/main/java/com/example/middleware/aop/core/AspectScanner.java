package com.example.middleware.aop.core;

import com.example.middleware.aop.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.net.URL;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class AspectScanner {
    private static final Logger log = LoggerFactory.getLogger(AspectScanner.class);
    private static final Map<String, List<Object>> ASPECT_CACHE = new ConcurrentHashMap<>();

    public static List<Object> scanAspects(String basePackage) {
        return ASPECT_CACHE.computeIfAbsent(basePackage, AspectScanner::doScanAspects);
    }

    private static List<Object> doScanAspects(String basePackage) {
        List<Object> aspects = new ArrayList<>();
        try {
            String path = basePackage.replace('.', '/');
            Enumeration<URL> resources = Thread.currentThread().getContextClassLoader().getResources(path);
            while (resources.hasMoreElements()) {
                URL resource = resources.nextElement();
                File dir = new File(resource.toURI());
                if (dir.exists() && dir.isDirectory()) {
                    for (File file : Objects.requireNonNull(dir.listFiles())) {
                        if (file.getName().endsWith(".class")) {
                            String className = basePackage + "." + file.getName().replace(".class", "");
                            Class<?> clazz = Class.forName(className);
                            if (clazz.isAnnotationPresent(Aspect.class)) {
                                aspects.add(clazz.getDeclaredConstructor().newInstance());
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            log.error("扫描切面失败", e);
        }
        return aspects;
    }
}