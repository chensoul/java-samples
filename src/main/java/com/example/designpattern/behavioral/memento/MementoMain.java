package com.example.designpattern.behavioral.memento;

public class MementoMain {

	public static void main(String [] args){
		StateManager stateManager = new StateManager();
		Product product = new Product("Product1","category1");
		stateManager.addState(product.stateSaver());
		product = new Product("Product2","category2");
		stateManager.addState(product.stateSaver());
		product = new Product("Product3","category3");
		System.out.println(product.getProductName() + "<>" + product.getProductCategory());
		for(ProductStateSaver productStateSaver : stateManager.getStateSaverList()){
			System.out.println(productStateSaver.product.getProductName() + "<>" + productStateSaver.product.getProductCategory());
			
		}
	}
}
