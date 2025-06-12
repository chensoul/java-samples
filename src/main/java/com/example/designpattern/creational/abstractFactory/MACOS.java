package com.example.designpattern.creational.abstractFactory;

public class MACOS implements OperatingSystem {

	@Override
	public void versionNumber() {
		System.out.println("Mac OS X");
		
	}

	@Override
	public void versionName() {
		System.out.println("Yosemite");
	}

}
