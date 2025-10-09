package com.example1.services;

import com.example1.services.impl.TestServiceImpl;

public sealed interface TestService permits TestServiceImpl{

    void m();

    static TestService getInstance() {
        return new TestServiceImpl();
    }
}
