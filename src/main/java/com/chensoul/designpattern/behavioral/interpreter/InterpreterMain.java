package com.chensoul.designpattern.behavioral.interpreter;

public class InterpreterMain {

	public static void main(String[] args){
		
		DecoderInterface doubleDecoder1 = new DoubleDecoder(2);
		DecoderInterface doubleDecoder2 = new DoubleDecoder(3);
				
		DecoderInterface equate = new EquateDecoder(doubleDecoder1, doubleDecoder2);
		System.out.println(equate.decode());
		equate = new EquateDecoder(doubleDecoder1, doubleDecoder1);
		System.out.println(equate.decode());
	}
}
