package com.kodilla.good.patterns.challenges.OrderServiceStuff;

public class Product {
    private final String productName;
    private final double price;
    private final ProductType productType;

    public Product(String productName, double price, ProductType productType) {
        this.productName = productName;
        this.price = price;
        this.productType = productType;
    }
}
