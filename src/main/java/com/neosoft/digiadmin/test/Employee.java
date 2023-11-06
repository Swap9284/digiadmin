package com.neosoft.digiadmin.test;

public class Employee {
	
	Address add;
	
	public Employee() {
		//add = new Address();
		add = Factory.getObjectOfAddress();
	}
	
	public void displayAddress() {
		
		add.showAddress();
		
	}

}
