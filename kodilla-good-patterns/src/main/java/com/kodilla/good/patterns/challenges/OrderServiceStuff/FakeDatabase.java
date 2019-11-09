package com.kodilla.good.patterns.challenges.OrderServiceStuff;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FakeDatabase implements DatabaseOperator {
    private Map<ProductType, Integer> amountOfStuff;
    private List<User> users;
    private List<OrderDto> ordersMade;

    private FakeDatabase(int amountOfBikes, int amountOfComputers, int amountOfSocks, ArrayList<User> users) {
        this. amountOfStuff = new HashMap<>();
        amountOfStuff.put(ProductType.BIKE, amountOfBikes);
        amountOfStuff.put(ProductType.COMPUTER, amountOfComputers);
        amountOfStuff.put(ProductType.SOCKS, amountOfSocks);
        this.ordersMade = new ArrayList<>();
        this.users = users;
    }

    public FakeDatabase() {
        this(10,10,10, createUsers());
    }

    private static ArrayList<User> createUsers(){
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("Adam","Małysz", "malamysz@wp.pl",LocalDate.of(1977,12,3)));
        users.add(new User("Brad","Pitt", "iamawesome@gmail.com",LocalDate.of(1963,12,18)));
        users.add(new User("Tim","Burton", "bigfish@bbc.co.uk",LocalDate.of(1958,8,25)));
        users.add(new User("Albert","Einstein", "sienceisawesome@yahoo.com",LocalDate.of(1879,3,14)));
        return users;
    }

    public User getUser(int number) {
        return users.get(number);
    }

    public int getAmountOfProduct(ProductType type) {
        return amountOfStuff.get(type);
    }

    public void productSubstract(ProductType type, int amount) {
        int actualAmount = amountOfStuff.get(type);
        amountOfStuff.put(type, actualAmount - amount);
        System.out.println("DB: Changed amount of " + type + " from " + actualAmount + " to " + (actualAmount - amount));
    }

    public void makeOrderRecord(OrderDto order) {
        ordersMade.add(order);
    }
}
