package com.example.designpattern.structural.bridge;

public class ToshibaRemote implements Remote{
	
	private Toshiba toshiba = new Toshiba();
	
	@Override
	public void on() {
		toshiba.on();
		
	}

	@Override
	public void off() {
		toshiba.off();
	}

	@Override
	public void changeChannel(Integer number) {
		toshiba.changeChannel(number);
		
	}

}
