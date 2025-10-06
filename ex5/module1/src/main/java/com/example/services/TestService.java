package com.example.services;

import com.example.services.impl.TestServiceImpl;

public sealed interface TestService permits TestServiceImpl{

    void m();

    static TestService getInstance() {
        return new TestServiceImpl();
    }
}
