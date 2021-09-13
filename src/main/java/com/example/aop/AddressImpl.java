package com.example.aop;

public class AddressImpl implements Address{

    String street ;

    public AddressImpl() {
        street = "road #99";
    }

    @Override
    public void showDetail() {
        // TODO Auto-generated method stub
        System.out.println("address: " + street);
    }
    
}