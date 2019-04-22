package com.example.demo.model;

import com.example.demo.abstracts.AbstractCustomer;

public class RealCustomer extends AbstractCustomer {

	public RealCustomer(String name) {
		this.name = name;
	}

	@Override
	public boolean isNull() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

}
