package com.chensoul.designpattern.structural.flyweight;

public class FlyweightMain {
	
	public static void main(String[] args){
		Flyweight flyweight = new Flyweight();
		flyweight.getProductDetails("Product1_", 1);
		flyweight.getProductDetails("Product2_", 2);
		flyweight.getProductDetails("Product3_", 3);
	}
}
