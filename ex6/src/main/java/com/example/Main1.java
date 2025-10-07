package com.example;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Main1 {
    public static void main(String[] args) throws Exception {

        // IoC -> DI (wiring & autowiring) / Interceptors (Aspects)

        // Java Reflection DI -> Fields, Interceptors -> JVM Proxy

        // CAN'T -> change final fields, enter jigsaw modules (strong encapsulation)

        Class productServiceClass = Class.forName("com.example.services.ProductServiceImpl");

        Constructor constructorProductService = productServiceClass.getConstructor();

        Object o = constructorProductService.newInstance();

        System.out.println(o);

        Method method = productServiceClass.getDeclaredMethod("printProduct");
        method.setAccessible(true);

        method.invoke(o);
    }
}