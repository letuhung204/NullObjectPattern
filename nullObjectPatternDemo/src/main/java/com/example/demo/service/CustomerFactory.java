package com.example.demo.service;

import com.example.demo.abstracts.AbstractCustomer;
import com.example.demo.model.NullCustomer;
import com.example.demo.model.RealCustomer;

public class CustomerFactory {
	public static final String[] name = { "hung", "cuong", "quoc anh" };

	public AbstractCustomer getCustomer(String nameGet) {
		for (int i = 0; i < name.length; i++) {
			if (name[i].equalsIgnoreCase(nameGet)) {
				return new RealCustomer(nameGet);
			}
		}
		return new NullCustomer();
	}
}
