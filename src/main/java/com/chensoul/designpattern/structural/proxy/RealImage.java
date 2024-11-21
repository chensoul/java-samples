package com.chensoul.designpattern.structural.proxy;

public class RealImage implements Image{

	@Override
	public void displayName() {
		System.out.println("Image Name");
		
	}
	
	public void displayHiddenName(){
		System.out.println("Hidden Name");
	}

}
