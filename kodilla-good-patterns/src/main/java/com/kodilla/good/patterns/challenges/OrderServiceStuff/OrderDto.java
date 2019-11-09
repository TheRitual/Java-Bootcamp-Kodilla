package com.kodilla.good.patterns.challenges.OrderServiceStuff;

import java.util.Set;

public class OrderDto {
    private Set<SingleOrder> shoppingList;
    private User user;

    public OrderDto(Set<SingleOrder> shoppingList, User user) {
        this.shoppingList = shoppingList;
        this.user = user;
    }

    public Set<SingleOrder> getShoppingList() {
        return shoppingList;
    }

    public User getUser() {
        return user;
    }
}
