package com.chensoul.designpattern.behavioral.strategy;

public class StrategyMain {
	
	public static void main(String[] args){
		Calculate add = new Addition();
		Calculate sub = new Subtraction();
		Invoker invoker = new Invoker(add, 10, 5);
		invoker = new Invoker(sub, 10, 5);
	}
}
