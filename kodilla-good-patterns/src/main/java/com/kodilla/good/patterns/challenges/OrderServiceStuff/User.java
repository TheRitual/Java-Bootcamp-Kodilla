package com.kodilla.good.patterns.challenges.OrderServiceStuff;

import java.time.LocalDate;

public final class User {
    private final String name;
    private final String surname;
    private final String email;
    private final LocalDate dateOfBirth;

    User(String name, String surname, String email, LocalDate dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
}
