package com.example.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AddressAspect {
    @DeclareParents(value="com.example.aop.Customer+", defaultImpl=AddressImpl.class)
    public Address Address;
}