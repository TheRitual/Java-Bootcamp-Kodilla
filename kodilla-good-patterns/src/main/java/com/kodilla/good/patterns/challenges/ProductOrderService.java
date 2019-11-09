package com.kodilla.good.patterns.challenges;

import com.kodilla.good.patterns.challenges.OrderServiceStuff.*;

class ProductOrderService {
    private final AnnouncementService announcement;
    private final DatabaseOperator database;

    ProductOrderService(AnnouncementService announcement, DatabaseOperator database) {
        this.announcement = announcement;
        this.database = database;
    }

    boolean process(OrderDto order) {
        boolean allInWarehouse = order.getShoppingList().stream()
                .allMatch(p -> database.getAmountOfProduct(p.getType()) >= p.getAmount());
        if(allInWarehouse) {
            order.getShoppingList().forEach(p -> database.productSubstract(p.getType(),p.getAmount()));
            System.out.println("Order completed.");
            announcement.sendMessage(order.getUser().getEmail());
            return true;
        } else {
            System.out.println("Can't collect all products.");
            return false;
        }
    }
}