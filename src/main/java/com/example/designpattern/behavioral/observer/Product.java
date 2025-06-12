package com.example.designpattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Product {
	
	private int productPrice;
	
	private List<Stakeholder> stakeholderList = new ArrayList<Stakeholder>(); 
	
	/**
	 * @return the productPrice
	 */
	public int getProductPrice() {
		return productPrice;
	}

	/**
	 * @param productPrice the productPrice to set
	 */
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
		notifyStakeholders();
	}
	
	public void notifyStakeholders(){
		for(Stakeholder stakeholder : stakeholderList){
			stakeholder.update();
		}
	}

	/**
	 * @return the stakeholderList
	 */
	public List<Stakeholder> getStakeholderList() {
		return stakeholderList;
	}

	/**
	 * @param stakeholderList the stakeholderList to set
	 */
	public void setStakeholderList(List<Stakeholder> stakeholderList) {
		this.stakeholderList = stakeholderList;
	}
	
	
}
