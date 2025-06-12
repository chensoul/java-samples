package com.example.middleware.aop.util;

import java.io.File;
import java.net.URL;
import java.util.*;

public class ClassUtils {
    public static Class<?> findImplementationClass(Class<?> interfaceClass) {
        String packageName = interfaceClass.getPackage().getName();
        String path = packageName.replace('.', '/');
        try {
            Enumeration<URL> resources = Thread.currentThread().getContextClassLoader().getResources(path);
            while (resources.hasMoreElements()) {
                URL resource = resources.nextElement();
                File dir = new File(resource.toURI());
                if (dir.exists() && dir.isDirectory()) {
                    for (File file : Objects.requireNonNull(dir.listFiles())) {
                        if (file.getName().endsWith(".class")) {
                            String className = packageName + "." + file.getName().replace(".class", "");
                            Class<?> clazz = Class.forName(className);
                            if (!clazz.isInterface() && interfaceClass.isAssignableFrom(clazz)) {
                                return clazz;
                            }
                        }
                    }
                }
            }
        } catch (Exception ignored) {
        }
        return null;
    }
}