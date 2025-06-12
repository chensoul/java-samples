package com.example.designpattern.structural.adapter;

public class ProductAdapter implements ProductAdapterInterface{
	
	Product product;
	
	public void setProductName(String productName){
		product = new Product();
		product.setProductName(productName);
		System.out.println(product.getProductName());
	}
	
	public void setProductNumber(Integer productNumber){
		product = new Product();
		product.setProductNumber(productNumber);
		System.out.println(product.getProductNumber());
	}
}
