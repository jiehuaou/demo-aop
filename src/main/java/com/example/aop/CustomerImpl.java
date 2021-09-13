package com.example.aop;

import org.springframework.stereotype.Component;

@Component("customer1")
public class CustomerImpl implements Customer{

    @Override
    public void addCustomer(){
		System.out.println("Customer Impl addCustomer() is running ");
	}

	@Override
	public int drawMoney(int x) {
		// TODO Auto-generated method stub
        System.out.println("Customer Impl drawMoney() is running ");
        return 10;
	}

}