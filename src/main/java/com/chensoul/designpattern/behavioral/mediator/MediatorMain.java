package com.chensoul.designpattern.behavioral.mediator;

public class MediatorMain {
	
	public static void main(String[] args){
		User user1 = new User("User1");
		user1.sendMessage("Hi User 2");
		User user2 = new User("User2");
		user2.sendMessage("Hello User 1");
	}
}
