package com.example.aop.abc;

import org.springframework.stereotype.Component;

/**
 * advice will be exectued on methods of this class with Custom Annotation,
 */

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

    public void hello() {
        System.out.println("Doing hello");
    }
}
