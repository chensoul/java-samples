package com.chensoul.designpattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee{

	private String managerName;
	private String managerId;
	List<Employee> employeelist = new ArrayList<Employee>();
	
	public Manager(String name, String id){
		managerName=name;
		managerId=id;
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return managerName;
	}

	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return managerId;
	}

	@Override
	public void addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employeelist.add(employee);
		
	}
	
	public void print(){
		
		System.out.println("name>>"+managerName);
		System.out.println("id>>"+managerId);
		
		for(Employee employee : employeelist){
			employee.print();
		}
	}

}
