package com.example.designpattern.creational.prototype;

public class PrototypeMain {

	public static void main(String [] args){
		Product product1 = new ProductA("productDsdataName");
		System.out.println(((ProductA)product1).getName());
		
		Product product2 = product1.getClone();
		System.out.println(((ProductA)product2).getName());

	}
}
