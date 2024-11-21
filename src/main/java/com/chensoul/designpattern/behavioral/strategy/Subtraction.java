package com.chensoul.designpattern.behavioral.strategy;

public class Subtraction implements Calculate{
	
	public void executeOperation(int num1,int num2){
		System.out.println("Subtraction>>"+ (num1-num2));
	}
}
