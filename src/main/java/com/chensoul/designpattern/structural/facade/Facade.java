package com.chensoul.designpattern.structural.facade;

public class Facade {
	
	public void mergePrice(int price){
		Product1 product1 = new Product1();
		product1.calculatePrice(price, price);
		Product2 product2 = new Product2();
		product2.calculateShowPrice(product1, price);
	}
}
