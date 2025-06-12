package com.example.designpattern.structural.bridge;

public class BridgeMain {

	public static void main(String[] args){
		Remote remote = new ToshibaRemote();
		remote.on();
		remote.off();
		remote.changeChannel(1);
		
		remote = new SonyRemote();
		remote.on();
		remote.off();
		remote.changeChannel(1);
		
	}
}
