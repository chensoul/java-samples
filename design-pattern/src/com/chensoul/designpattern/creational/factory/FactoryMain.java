package com.chensoul.designpattern.creational.factory;

public class FactoryMain {
	
	public static void main(String [] args){
		ProductFactory productFactory = new ProductFactory();
		productFactory.getProductname("A");
		productFactory.getProductname("B");
	}
}
