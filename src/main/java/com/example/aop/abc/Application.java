package com.example.aop.abc;

import org.springframework.stereotype.Component;

@MyAnnotation
@Component
public class Application {
    private int nonStaticMember;
    private static int staticMember;

    public Application(){}

//    @Override
    public void doSomething() {
        System.out.println("Doing something");
        nonStaticMember = 11;
    }

//    @Override
    public void doSomethingElse() {
        System.out.println("Doing something else");
        staticMember = 22;
    }
}
