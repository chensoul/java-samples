package com.chensoul.designpattern.creational.abstractFactory;

public class MSWindowFactory implements WindowFactory{
	
	public OperatingSystem createOS(){
		return new MSWindow();
	}
}
