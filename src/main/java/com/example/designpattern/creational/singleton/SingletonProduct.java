package com.example.designpattern.creational.singleton;

public class SingletonProduct {

	private static SingletonProduct singletonProduct = null;
	
	private SingletonProduct(){
		
	}
	
	public static SingletonProduct getSingleInstance(){
		if(null == singletonProduct)
			singletonProduct = new SingletonProduct();	
		return singletonProduct;
	}
	
	public void printSingleton(){
		System.out.println("Single Object Instance");
	}
	
}
