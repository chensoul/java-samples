package com.chensoul.designpattern.creational.abstractFactory;

public class AbstractFactoryMain {
	
	public static void main(String[] args){
		
		WindowFactory windowFactoryMS = new MSWindowFactory();
		windowFactoryMS.createOS().versionName();
		windowFactoryMS.createOS().versionNumber();
		
		WindowFactory windowFactoryMAC = new MACOSFactory();
		windowFactoryMAC.createOS().versionName();
		windowFactoryMAC.createOS().versionNumber();
	}
}
