package com.chensoul.designpattern.structural.facade;

public class Product2 {
	
	public void calculateShowPrice(Product1 product1, int price){
		System.out.println(price);
		product1.calculatePrice(price, price);
	}
}
