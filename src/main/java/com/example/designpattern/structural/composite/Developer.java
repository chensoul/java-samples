package com.example.designpattern.structural.composite;

public class Developer implements Employee{
	
	private String developerName;
	private String developerId;
	
	public Developer(String name,String id){
		
		developerName = name;
		developerId = id;
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return developerName;
	}

	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return developerId;
	}

	@Override
	public void addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void print() {
		System.out.println("Name>>"+developerName);
		System.out.println("Id>>"+developerId);
	}

}
