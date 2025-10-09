package com.example.tasks;

import com.example.RunAsync;

@RunAsync
public class SomeClass {

    public void a() {
        System.out.println("a");
    }

    @RunAsync
    public void b() {
        System.out.println("b");
    }

    public void c() {
        System.out.println("c");
    }

    @RunAsync
    public void d() {
        System.out.println("d");
    }
}
