package com.chensoul.designpattern.structural.adapter;

public class AdapterMain {

    public static void main(String[] args) {
        com.chensoul.designpattern.structural.adapter.ProductAdapter productAdapter = new com.chensoul.designpattern.structural.adapter.ProductAdapter();
        productAdapter.setProductName("ProductTest");
        productAdapter.setProductNumber(1);
    }
}
