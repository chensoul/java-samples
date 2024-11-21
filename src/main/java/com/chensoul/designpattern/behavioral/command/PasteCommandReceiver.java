package com.chensoul.designpattern.behavioral.command;

public class PasteCommandReceiver implements CommandInterface{
	public void execute(){
		System.out.println("Paste Command Executed");
	}

}
