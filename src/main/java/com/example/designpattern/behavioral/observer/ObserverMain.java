package com.example.designpattern.behavioral.observer;

public class ObserverMain {
	
	public static void main(String[] args){
		Product product = new Product();
		Stakeholder producer = new Producer(product);
		Stakeholder consumer = new Consumer(product);
		product.setProductPrice(10);
		product.setProductPrice(15);
		
	}
}
