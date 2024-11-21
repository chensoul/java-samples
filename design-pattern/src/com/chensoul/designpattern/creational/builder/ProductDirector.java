package com.chensoul.designpattern.creational.builder;

public class ProductDirector {
	
	Product createSpecificProduct(ProductCreator productCreator){
		return productCreator.createProduct();
	}
}
