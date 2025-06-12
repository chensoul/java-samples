package com.example.designpattern.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class StateManager {
	
	private List<ProductStateSaver> stateSaverList = new ArrayList<ProductStateSaver>();
	
	public void addState(ProductStateSaver stateSaver){
		stateSaverList.add(stateSaver);
	}
	
	public void getState(int index){
		stateSaverList.get(index);
	}

	/**
	 * @return the stateSaverList
	 */
	public List<ProductStateSaver> getStateSaverList() {
		return stateSaverList;
	}

	/**
	 * @param stateSaverList the stateSaverList to set
	 */
	public void setStateSaverList(List<ProductStateSaver> stateSaverList) {
		this.stateSaverList = stateSaverList;
	}
}
