package com.chensoul.designpattern.structural.flyweight;

public class Product {
	
	private String productName;
	private Integer productId;
	public void printName(){
		System.out.println(productName + productId);
	}
	Product(String productName,Integer productId){
		this.productName=productName;
		this.productId=productId;
	}
}
