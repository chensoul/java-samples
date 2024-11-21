package com.chensoul.designpattern.behavioral.command;

public class CommandInvoker {
	
	public void invokeCommand(CommandInterface command){
		command.execute();
	}
}
