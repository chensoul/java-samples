package com.example.designpattern.behavioral.visitor;

public interface ComputerPartVisitor {
	public void visit(Mouse mouse);
	public void visit(Keyboard keyboard);
}
