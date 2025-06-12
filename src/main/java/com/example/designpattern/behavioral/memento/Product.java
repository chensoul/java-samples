package com.example.designpattern.behavioral.memento;

public class Product {
	
	private String productName;
	private String productCategory;
	
	public ProductStateSaver stateSaver(){
		return new ProductStateSaver(this);
	}
	
	public Product(String name,String category){
		this.productName = name;
		this.productCategory = category;
	}

	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}

	/**
	 * @return the productCategory
	 */
	public String getProductCategory() {
		return productCategory;
	}

	/**
	 * @param productCategory the productCategory to set
	 */
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
}
