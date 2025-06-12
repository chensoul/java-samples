package com.example.designpattern.behavioral.strategy;

public class Addition implements Calculate{

	public void executeOperation(int num1,int num2){
		System.out.println("Addition>>"+ (num1+num2));
	}
}
