package com.example.aop;

import com.example.aop.abc.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoSpringApplication implements CommandLineRunner{

	@Autowired()
	@Qualifier("customer1")
	Customer customer;

	@Autowired	Application app;

//	@Autowired Member mem;

	
	public static void main(String[] args) {

		SpringApplication.run(DemoSpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		customer.addCustomer();

		System.out.println("-----------------------------");
		// 
		int ret = customer.drawMoney(300);
		System.out.println("customer.drawMoney() ==> " + ret);

		System.out.println("-----------------------------");
		// 
		Address addr = (Address) customer;
		addr.showDetail();

		System.out.println("-----------------------------");
//		Application app = new Application();
		app.doSomething();
		app.doSomethingElse();

		System.out.println("-----------------------------");
//		mem.doSomething();
//		mem.doSomethingElse();

	}

}
