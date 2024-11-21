package com.chensoul.designpattern.behavioral.templateMethod;

public class TemplateMethodMain {
	
	public static void main(String[] args){
		Game football = new Football();
		football.sequence();
		Game cricket = new Cricket();
		cricket.sequence();
	}
}
