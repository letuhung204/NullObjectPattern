package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.abstracts.AbstractCustomer;
import com.example.demo.service.CustomerFactory;

@SpringBootApplication
public class NullObjectPatternDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(NullObjectPatternDemoApplication.class, args);
		CustomerFactory customerFactory = new CustomerFactory();
		AbstractCustomer customer1 = customerFactory.getCustomer("hung");
		AbstractCustomer customer2 = customerFactory.getCustomer("cuong");
		AbstractCustomer customer3 = customerFactory.getCustomer("linh");
		AbstractCustomer customer4 = customerFactory.getCustomer("quoc anh");
		
		System.out.println("get name :");
		System.out.println(customer1.getName());
		System.out.println(customer2.getName());
		System.out.println(customer3.getName());
		System.out.println(customer4.getName());
		
		//ta sẽ thấy ko get được linh vì khong tồn tại tên đố trong list name nó sẽ trả về naem của object NullCustomer.
	}

}
