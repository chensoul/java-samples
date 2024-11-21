package com.chensoul.designpattern.structural.proxy;

public class ProxyImage implements Image{
	
	RealImage realImage;
	
	@Override
	public void displayName() {
		realImage.displayName();
		
	}
	
	public void getRequiredName(String type){
		realImage = new RealImage();
		if(type.equalsIgnoreCase("real"))
			realImage.displayName();
		else
			realImage.displayHiddenName();
	}

}
