package com.chensoul.designpattern.behavioral.interpreter;

public class DoubleDecoder implements DecoderInterface{
	
	int number;
	
	public DoubleDecoder(int number){
		this.number=number;
	}
	
	public int decode(){
		return 2*number;
	}
}
