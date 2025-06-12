package com.example.designpattern.creational.abstractFactory;

public class MSWindow implements OperatingSystem{

	@Override
	public void versionNumber() {
		System.out.println("Windows 10");	
	}

	@Override
	public void versionName() {
		// TODO Auto-generated method stub
		System.out.println("Microsoft");
	}
	
}
