package com.example.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

/**
 * introduce an interface (Address) onto an existing bean (Customer) without changing the bean’s source code. 
 */

@Component
@Aspect
public class AddressAspect {
    @DeclareParents(value="com.example.aop.Customer+", defaultImpl=AddressImpl.class)
    public Address Address;
}