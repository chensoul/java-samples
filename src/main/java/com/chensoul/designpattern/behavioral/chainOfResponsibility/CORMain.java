package com.chensoul.designpattern.behavioral.chainOfResponsibility;

public class CORMain {
	public static void main(String[] args){
		ProductClient client = new ProductClient();
		client.displayData("name");
		client.displayData("category");
	}
}
