package com.chensoul.designpattern.structural.bridge;

public class Sony implements Television{

	@Override
	public void on() {
		System.out.println("Sony On");
		
	}

	@Override
	public void off() {
		System.out.println("Sony Off");
		
	}

	@Override
	public void changeChannel(Integer number) {
		System.out.println("Sony Channel");
		
	}

}
