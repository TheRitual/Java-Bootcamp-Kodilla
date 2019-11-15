package com.kodilla.good.patterns.challenges.Food2Door;

public interface Order {
    void setupOrder(ProductType productType, int amount);
    ProductType getType();
    int getAmount();
}
