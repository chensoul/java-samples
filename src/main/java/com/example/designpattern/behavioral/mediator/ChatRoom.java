package com.example.designpattern.behavioral.mediator;

public class ChatRoom {
	public void showMessage(User user, String message){
		System.out.println(user.getName() + "<>" + message);
	}
}
