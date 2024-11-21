package com.chensoul.designpattern.behavioral.templateMethod;

public class Cricket extends Game{
	
	public void start(){
		System.out.println("Cricket Start");
	}
	public void progress(){
		System.out.println("Cricket Progress");
	}
	public void stop(){
		System.out.println("Cricket Stop");
	}
	
}
