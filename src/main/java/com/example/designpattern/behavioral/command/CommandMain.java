package com.example.designpattern.behavioral.command;

public class CommandMain {

	public static void main(String[] args){
		CommandInvoker invoker = new CommandInvoker();
		CommandInterface command = new CopyCommandReceiver();
		invoker.invokeCommand(command);
		command = new PasteCommandReceiver();
		invoker.invokeCommand(command);
		command = new DeleteCommandReceiver();
		invoker.invokeCommand(command);
	}
}
