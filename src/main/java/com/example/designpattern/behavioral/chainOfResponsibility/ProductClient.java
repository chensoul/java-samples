package com.example.designpattern.behavioral.chainOfResponsibility;

public class ProductClient {
	
	public void displayData(String type){
		ProductHandler nameHandler = new ProductNameHandler();
			nameHandler.displayData(type);
	}
		
}
