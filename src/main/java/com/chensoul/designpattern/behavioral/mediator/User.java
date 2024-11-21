package com.chensoul.designpattern.behavioral.mediator;

public class User {
	
	private String name;
	
	public User(String name){
		this.name=name;
	}
	
	public void sendMessage(String message){
		ChatRoom obj = new ChatRoom();
		obj.showMessage(this, message);
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
}
