package com.example.designpattern.behavioral.templateMethod;

public class Football extends Game{
	
	public void start(){
		System.out.println("Football Start");
	}
	public void progress(){
		System.out.println("Football Progress");
	}
	public void stop(){
		System.out.println("Football Stop");
	}
	
}
