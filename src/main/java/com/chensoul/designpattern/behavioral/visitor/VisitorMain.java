package com.chensoul.designpattern.behavioral.visitor;

public class VisitorMain {
	
	public static void main(String[] args){
		ComputerPartVisitor visitor = new Visitor();
		ComputerPart part = new Mouse();
		part.visited(visitor);
		part = new Keyboard();
		part.visited(visitor);
	}
}
