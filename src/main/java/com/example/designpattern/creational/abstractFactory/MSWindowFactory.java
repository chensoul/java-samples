package com.example.designpattern.creational.abstractFactory;

public class MSWindowFactory implements WindowFactory{
	
	public OperatingSystem createOS(){
		return new MSWindow();
	}
}
