package com.example.demo.model;

import com.example.demo.abstracts.AbstractCustomer;

public class NullCustomer extends AbstractCustomer{

	@Override
	public boolean isNull() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "name don't have";
	}

}
