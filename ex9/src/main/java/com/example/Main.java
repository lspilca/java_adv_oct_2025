package com.example;


import java.lang.reflect.Method;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        try {
            String packageName = "com.example.tasks";

            ProvidedClassesManager providedClassesManager = new ProvidedClassesManager();

            List<Class> providedClasses = providedClassesManager.findProvidedClasses(packageName);

            RunAsyncAnnotatedClassesManager runAsyncAnnotatedClassesManager = new RunAsyncAnnotatedClassesManager(providedClasses);

            List<Class> annotatedClasses = runAsyncAnnotatedClassesManager.filterAnnotatedMethods();

            RunAsyncAnnotatedMethodsManager  runAsyncAnnotatedMethodsManager = new RunAsyncAnnotatedMethodsManager(annotatedClasses);

            List<Method> annotatedMethods = runAsyncAnnotatedMethodsManager.filterAnnotatedMethods();

            annotatedMethods.forEach(m -> PoolManager.getInstance().addTask(new MethodRunnable(m)));

        } finally {
            PoolManager.getInstance().shutdown();
        }
    }
}