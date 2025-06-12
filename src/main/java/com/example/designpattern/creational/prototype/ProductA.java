package com.example.designpattern.creational.prototype;

public class ProductA implements Product{
	
	
	private static ProductA productA;
	private String name;
	public Product getClone(){
		
		return this;
	}
		ProductA(String nameP){
			name=nameP;
		}
		/**
		 * @return the name
		 */
		public String getName() {
			return name;
		}
		/**
		 * @param name the name to set
		 */
		public void setName(String name) {
			this.name = name;
		}
}
