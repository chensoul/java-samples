package com.example.designpattern.behavioral.state;

public class StateMain {
	
	public static void main(String[] args){
		Machine machine = new Machine();
		State startState = new StartState(machine);
		machine.getState().action();
		State stopState = new StopState(machine);
		machine.getState().action();
	}
}
