package com.example.designpattern.behavioral.command;

public class CopyCommandReceiver implements CommandInterface{
	public void execute(){
		System.out.println("Copy Command Executed");
	}
}
