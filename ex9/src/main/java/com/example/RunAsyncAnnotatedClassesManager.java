package com.example;

import java.util.List;

public class RunAsyncAnnotatedClassesManager {

    private final List<Class> classes;

    public RunAsyncAnnotatedClassesManager(List<Class> classes) {
        this.classes = classes;
    }

    public List<Class> filterAnnotatedMethods() {
        return classes.stream()
                .filter(c -> c.isAnnotationPresent(RunAsync.class))
                .toList();
    }
}
