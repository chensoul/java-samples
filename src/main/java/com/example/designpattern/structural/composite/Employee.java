package com.example.designpattern.structural.composite;

public interface Employee {

	public String getName();
	public String getId();
	public void addEmployee(Employee employee);
	public void print();
}
