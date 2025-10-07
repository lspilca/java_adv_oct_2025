package com.example.ex8;

class GreeterImpl implements Greeter {

    @Override
    public String greet(String name) {
        return "Hello " + name;
    }

}

