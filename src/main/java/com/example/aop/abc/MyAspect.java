package com.example.aop.abc;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * advice on Custom Annotation
 */

@Aspect
@Component
public class MyAspect {


    @Before("execution(* com.example.aop.abc..*(..)) && @target(com.example.aop.abc.MyAnnotation)")
    public void adviceTarget(JoinPoint thisJoinPoint) {
        System.out.println("[@target] " + thisJoinPoint);
    }

    @Before("@within(com.example.aop.abc.MyAnnotation)")
    public void adviceWithin(JoinPoint thisJoinPoint) {
        System.out.println("[@within] " + thisJoinPoint);
    }

}
