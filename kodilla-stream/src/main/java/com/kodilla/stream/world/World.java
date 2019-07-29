package com.kodilla.stream.world;

import java.util.List;

public final class World {
    private final List<Continent> listOfContinents;

    public World(List<Continent> listOfContinents) {
        this.listOfContinents = listOfContinents;
    }

    public List<Continent> getListOfContinents() {
        return listOfContinents;
    }
}
