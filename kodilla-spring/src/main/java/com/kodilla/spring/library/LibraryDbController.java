package com.kodilla.spring.library;

import org.springframework.stereotype.Repository;

import java.util.Random;

@Repository
public class LibraryDbController {
    private int random;

    public LibraryDbController() {
        random = new Random().nextInt(100);
    }

    public void saveData() {
        System.out.println("Saving data to the database [R - " + random + "]");
    }

    public void loadData() {
        System.out.println("Loading data from the database [R - " + random + "]");
    }
}
