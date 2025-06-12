package com.example.designpattern.structural.adapter;

public class Product {
	
	private String productName;
	private Integer productNumber;
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
	 * @return the productNumber
	 */
	public Integer getProductNumber() {
		return productNumber;
	}
	/**
	 * @param productNumber the productNumber to set
	 */
	public void setProductNumber(Integer productNumber) {
		this.productNumber = productNumber;
	}
}
