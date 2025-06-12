package com.example.designpattern.structural.bridge;

public class SonyRemote implements Remote{

	private Sony sony = new Sony();
	
	@Override
	public void on() {
		sony.on();
		
	}

	@Override
	public void off() {
		sony.off();
	}

	@Override
	public void changeChannel(Integer number) {
		sony.changeChannel(number);
		
	}

}
