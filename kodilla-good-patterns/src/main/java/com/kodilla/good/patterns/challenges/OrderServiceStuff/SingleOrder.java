package com.kodilla.good.patterns.challenges.OrderServiceStuff;

public class SingleOrder {
    private final ProductType type;
    private final int amount;

    public SingleOrder(ProductType type, int amount) {
        this.type = type;
        this.amount = amount;
    }

    public ProductType getType() {
        return type;
    }

    public int getAmount() {
        return amount;
    }
}
