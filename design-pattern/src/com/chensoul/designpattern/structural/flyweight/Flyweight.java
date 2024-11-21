package com.chensoul.designpattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class Flyweight {
	
	Map<Integer,Product> objectMap = new HashMap<Integer,Product>();
	
	public void getProductDetails(String productName,Integer productId){
		
		Product productObj = objectMap.get(productId);
		if(null != productObj){
			productObj.printName();
		}
		else{
			productObj = new Product(productName,productId);
			objectMap.put(productId, productObj);
			productObj.printName();
		}
	}
}
