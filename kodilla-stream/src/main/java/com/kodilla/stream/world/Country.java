package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {
    private final BigDecimal peopleQuantity;
    private final String countruName;

    public Country(String name, BigDecimal amountOfPpl) {
        this.peopleQuantity = amountOfPpl;
        this.countruName = name;
    }

    public String getCountruName() {
        return countruName;
    }

    public BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }
}
