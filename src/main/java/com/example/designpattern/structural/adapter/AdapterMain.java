package com.example.designpattern.structural.adapter;

public class AdapterMain {

    public static void main(String[] args) {
        com.example.designpattern.structural.adapter.ProductAdapter productAdapter = new com.example.designpattern.structural.adapter.ProductAdapter();
        productAdapter.setProductName("ProductTest");
        productAdapter.setProductNumber(1);
    }
}
