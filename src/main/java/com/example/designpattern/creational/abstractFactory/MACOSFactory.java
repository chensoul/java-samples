package com.example.designpattern.creational.abstractFactory;

public class MACOSFactory implements WindowFactory {

	public OperatingSystem createOS(){
		return new MACOS();
	}

}
