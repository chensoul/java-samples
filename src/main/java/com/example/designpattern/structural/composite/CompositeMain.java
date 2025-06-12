package com.example.designpattern.structural.composite;

public class CompositeMain {
	
	public static void main(String[] args){
		Employee manager1  = new Manager("mgr1","mgr1");
		Developer dev = new Developer("dev1", "1");
		manager1.addEmployee(dev);
		dev = new Developer("dev2", "2");
		manager1.addEmployee(dev);
		Employee sManager1  = new Manager("smgr1","smgr1");
		sManager1.addEmployee(manager1);
		dev = new Developer("dev3", "3");
		sManager1.addEmployee(dev);
		
		sManager1.print();
	}
}
