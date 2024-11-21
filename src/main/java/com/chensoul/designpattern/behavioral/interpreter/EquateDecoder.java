package com.chensoul.designpattern.behavioral.interpreter;

public class EquateDecoder implements DecoderInterface{
	
	DecoderInterface decoder1;
	DecoderInterface decoder2;
	
	public EquateDecoder(DecoderInterface d1,DecoderInterface d2){
		decoder1 = d1;
		decoder2 = d2;
		
	}
	
	public int decode(){
		
		if(decoder1.decode() == decoder2.decode())
			return 1;
		else
			return 0;
	}
}
