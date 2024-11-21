package com.chensoul.designpattern.behavioral.chainOfResponsibility;

public class ProductNameHandler implements ProductHandler{
	
	public void displayData(String type){
		if(type.equalsIgnoreCase("name")){
			System.out.println("Product Name handler Processed");
		}
		else{
			System.out.println("Routed to Product Category handler");
			ProductCategoryHandler categoryHandler = new ProductCategoryHandler();
			categoryHandler.displayData("category");
		}
	}
}
