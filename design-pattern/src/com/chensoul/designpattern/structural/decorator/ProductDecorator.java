package com.chensoul.designpattern.structural.decorator;

public class ProductDecorator implements ProductDecoratorInterface{

	@Override
	public void productName() {
		
		Product product = new Product();
		product.productName();
		
	}

	@Override
	public void productCategory() {
	
		System.out.println("Product Category");

	}

}
