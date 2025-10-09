package com.example;

import com.example.exceptions.ClassFileNotFoundException;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.util.List;

public class ProvidedClassesManager {

    public List<Class> findProvidedClasses(String packageName) {
        try {
            String path = packageName.replace(".", "/");
            URL url = Thread.currentThread().getContextClassLoader().getResource(path);

            var classes = Files.list(new File(url.getPath()).toPath());

            return classes
                            .map(f -> f.getFileName())
                            .map(f -> f.toString().split("\\.")[0])
                            .map(f -> packageName + "." + f)
                            .map(this::forName)
                            .toList();


        } catch (IOException e) {
            throw new ClassFileNotFoundException();
        }
    }

    private Class forName(String name) {
        try {
            return Class.forName(name);
        } catch (ClassNotFoundException e) {
            throw new ClassFileNotFoundException();
        }
    }
}
