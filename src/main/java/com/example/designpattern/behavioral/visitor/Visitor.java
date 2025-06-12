package com.example.designpattern.behavioral.visitor;

public class Visitor implements ComputerPartVisitor{

	@Override
	public void visit(Mouse mouse) {
		System.out.println("Mouse Visited");
		
	}

	@Override
	public void visit(Keyboard keyboard) {
		System.out.println("Keyboard Visited");
		
	}

}
