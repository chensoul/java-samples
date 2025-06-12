package com.example.designpattern.structural.bridge;

public class Toshiba implements Television{

	@Override
	public void on() {
		System.out.println("Toshiba On");
		
	}

	@Override
	public void off() {

		System.out.println("Toshiba Off");
		
	}

	@Override
	public void changeChannel(Integer number) {
		System.out.println("Toshiba Channel");
		
	}

}
