package com.example;

import com.example.services.ProductService;
import com.example.services.ProductServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Main2 {

    public static void main(String[] args) throws Exception {
        // JDK Proxy & CGLib

        InvocationHandler handler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                switch (method.getName()) {
                    case "a" -> System.out.println(":)");
                    case "b" -> System.out.println(":(");
                }
                return null;
            }
        };

        ProductService productService = (ProductService) Proxy.newProxyInstance(
                ProductService.class.getClassLoader(), new Class[]{ProductService.class}, handler
        );

        productService.b();
    }
}
