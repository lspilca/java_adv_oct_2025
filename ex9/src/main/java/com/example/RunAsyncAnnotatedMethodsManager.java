package com.example;

import java.lang.reflect.Method;
import java.util.List;
import java.util.stream.Stream;

public class RunAsyncAnnotatedMethodsManager {

    private final List<Class> classes;

    public RunAsyncAnnotatedMethodsManager(List<Class> classes) {
        this.classes = classes;
    }

    public List<Method> filterAnnotatedMethods() {
        return classes.stream()
                .flatMap(c -> Stream.of(c.getDeclaredMethods()))
                .peek(m -> m.setAccessible(true))
                .filter(annotatedMethod -> annotatedMethod.isAnnotationPresent(RunAsync.class))
                .toList();
    }
}
