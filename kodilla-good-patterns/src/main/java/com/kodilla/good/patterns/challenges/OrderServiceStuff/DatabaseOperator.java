package com.kodilla.good.patterns.challenges.OrderServiceStuff;

public interface DatabaseOperator {
        void productSubstract(ProductType type, int amount);
        int getAmountOfProduct(ProductType type);
        void makeOrderRecord(OrderDto order);
        User getUser(int number);
}
