package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> users;

    public Forum() {
        users = new ArrayList<>();
        users.add(new ForumUser("Shin", 'M', LocalDate.of(1991, Month.MARCH, 2), 150));
        users.add(new ForumUser("Fisher", 'M', LocalDate.of(1993, Month.APRIL, 18), 53));
        users.add(new ForumUser("DuckRiddle", 'M', LocalDate.of(1999, Month.SEPTEMBER, 19), 453));
        users.add(new ForumUser("Szaki", 'F', LocalDate.of(2001, Month.JULY, 12), 24));
        users.add(new ForumUser("AcidCat", 'F', LocalDate.of(1997, Month.FEBRUARY, 22), 57));
    }

    public List<ForumUser> getUsers() {
        return users;
    }
}
