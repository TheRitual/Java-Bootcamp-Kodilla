package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> users;

    public Forum() {
        users = new ArrayList<>();
        users.add(new ForumUser("Shin", ForumSex.MALE, LocalDate.of(1991, Month.MARCH, 2), 150));
        users.add(new ForumUser("Fisher", ForumSex.MALE, LocalDate.of(1993, Month.APRIL, 18), 53));
        users.add(new ForumUser("DuckRiddle", ForumSex.MALE, LocalDate.of(1999, Month.SEPTEMBER, 19), 453));
        users.add(new ForumUser("Szaki", ForumSex.FAMALE, LocalDate.of(2001, Month.JULY, 12), 24));
        users.add(new ForumUser("AcidCat", ForumSex.FAMALE, LocalDate.of(1997, Month.FEBRUARY, 22), 57));
        users.add(new ForumUser("Janusz", ForumSex.MALE, LocalDate.of(1999, Month.JULY, 30), 57));
        users.add(new ForumUser("SilentBob", ForumSex.MALE, LocalDate.of(1994, Month.DECEMBER, 24), 0));
        users.add(new ForumUser("YoungGuy", ForumSex.MALE, LocalDate.of(2004, Month.JANUARY, 11), 20));

    }

    public List<ForumUser> getUsers() {
        return users;
    }
}
