package com.example.designpattern.creational.builder;

public class ProductBuilderMain {
	public static void main(String[] args){
		ProductDirector productDirector = new ProductDirector();
		ProductCreator productCreatorA = new ProductCreatorA();
		Product productA = productDirector.createSpecificProduct(productCreatorA);
		System.out.println(productA.getProductName());
		System.out.println(productA.getProductNumber());
		
		ProductCreator productCreatorB = new ProductCreatorB();
		Product productB = productDirector.createSpecificProduct(productCreatorB);
		System.out.println(productB.getProductName());
		System.out.println(productB.getProductNumber());
	}
}
