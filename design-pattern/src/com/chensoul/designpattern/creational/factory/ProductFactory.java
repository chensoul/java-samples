package com.chensoul.designpattern.creational.factory;

public class ProductFactory {
	
	public void getProductname(String product){
		String name;
		Product productObj;
		if(product.equalsIgnoreCase("a")){
			productObj = new ProductA();
			productObj.productName();
		}else{
			productObj = new ProductB();
			productObj.productName();
		}
	}
}
