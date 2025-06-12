package com.example.designpattern.creational.builder;

public class ProductCreatorB implements ProductCreator{

	@Override
	public Product createProduct() {
		Product product = new Product();
		product.setProductName("B");
		product.setProductNumber("B1");
		return product;
		
	}
}
