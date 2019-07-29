package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.List;

public final class World {
    private final List<Continent> listOfContinents;

    public World(List<Continent> listOfContinents) {
        this.listOfContinents = listOfContinents;
    }

    private List<Continent> getListOfContinents() {
        return listOfContinents;
    }

    public BigDecimal getPeopleQuantity() {
        return this.getListOfContinents().stream()
                .flatMap(continent -> continent.getListOfCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, cur) -> sum = sum.add(cur));
    }
}
