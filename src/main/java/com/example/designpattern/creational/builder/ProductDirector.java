package com.example.designpattern.creational.builder;

public class ProductDirector {
	
	Product createSpecificProduct(ProductCreator productCreator){
		return productCreator.createProduct();
	}
}
