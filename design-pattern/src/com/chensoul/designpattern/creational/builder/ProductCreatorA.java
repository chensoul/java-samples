package com.chensoul.designpattern.creational.builder;

public class ProductCreatorA implements ProductCreator{

	@Override
	public Product createProduct() {
		Product product = new Product();
		product.setProductName("A");
		product.setProductNumber("A1");
		return product;
		
	}

}
