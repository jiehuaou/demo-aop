package com.example.aop;

import org.springframework.stereotype.Component;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import java.util.Arrays;

/**
 * Aspect on Customer
 */

@Component
@Aspect
public class CustomerAspect {

    @Pointcut("execution(* com.example.aop.Customer.drawMoney(..))")
    public void drawMoneyPointCut() {
        System.out.println("");
    }

    @Around("drawMoneyPointCut()")
    public int aroundCall(ProceedingJoinPoint jp) throws Throwable{
        String methodName = jp.getSignature().getName();
        Object[] args = jp.getArgs();
        System.out.println("Around.Before =========== " + methodName);
        System.out.println("Around.Before args =========== " + Arrays.toString(args));

        // call
        Object ret = jp.proceed();
        // int actual = 5 + (int)ret;
        int actual = (int)ret;
        // end
        System.out.println("Around.After =========== " + methodName);
        return actual;
    }

    @Before("drawMoneyPointCut())")
    public void beforeDrawMoney(JoinPoint jp) {
        String methodName = jp.getSignature().getName();
        System.out.println("beforeDrawMoney =========== " + methodName);
    }

    @After("drawMoneyPointCut())")
    public void afterDrawMoney(JoinPoint jp) {
        String methodName = jp.getSignature().getName();
        System.out.println("afterDrawMoney =========== " + methodName);
    }
 
    // @Before("repositoryMethods()")
    @Before("execution(* com.example.aop.Customer.addCustomer(..))")
    public void beforeCall(JoinPoint jp) {
        String methodName = jp.getSignature().getName();
        System.out.println("Before =========== " + methodName);
    }

    @After("execution(* com.example.aop.Customer.addCustomer(..))")
    public void afterCall(JoinPoint jp) {
        String methodName = jp.getSignature().getName();
        System.out.println("After =========== " + methodName);
    }


}