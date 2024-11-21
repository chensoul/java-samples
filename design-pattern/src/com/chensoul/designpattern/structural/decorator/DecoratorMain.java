package com.chensoul.designpattern.structural.decorator;

public class DecoratorMain {
	
	public static void main(String[] args){
		ProductDecoratorInterface productDecorator = new ProductDecorator();
		productDecorator.productName();
		productDecorator.productCategory();
	}
}
