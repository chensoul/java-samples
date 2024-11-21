package com.chensoul.designpattern.behavioral.observer;

public class Consumer implements Stakeholder{
	
	Product product;
	
	Consumer(Product product){
		this.product=product;
		product.getStakeholderList().add(this);
	}
	
	public void update(){
		System.out.println("Consumer Price>>"+product.getProductPrice());
		
	}
}
