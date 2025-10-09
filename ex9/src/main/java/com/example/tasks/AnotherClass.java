package com.example.tasks;

import com.example.RunAsync;

public class AnotherClass {

    public void x() {
        System.out.println("x");
    }

    public void y() {
        System.out.println("y");
    }

    @RunAsync
    public void z() {
        System.out.println("z");
    }
}
