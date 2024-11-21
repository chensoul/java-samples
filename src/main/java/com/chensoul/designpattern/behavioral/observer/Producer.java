package com.chensoul.designpattern.behavioral.observer;

public class Producer implements Stakeholder{
	
	Product product;
	
	public Producer(Product product){
		this.product=product;
		product.getStakeholderList().add(this);
	}
	
	public void update(){
		System.out.println("Producer Price>>"+product.getProductPrice());
	}
}