package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int uuid;
    private final String username;
    private final ForumSex sex;
    private final LocalDate dateOfBirth;
    private final int amountOfPosts;

    ForumUser(final String username, final ForumSex sex, final LocalDate dateOfBirth, final int amountOfPosts){
        LocalDate time = LocalDate.now();
        this.uuid = (int) System.currentTimeMillis() + this.hashCode();
        this.username = username;
        this.dateOfBirth = dateOfBirth;
        this.amountOfPosts = amountOfPosts;
        this.sex = sex;
    }

    public int getUuid() {
        return uuid;
    }

    public String getUsername() {
        return username;
    }

    public ForumSex getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getAmountOfPosts() {
        return amountOfPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "uuid = " + uuid +
                ", username = '" + username + '\'' +
                ", sex = " + sex +
                ", dateOfBirth = " + dateOfBirth +
                ", amountOfPosts = " + amountOfPosts +
                '}';
    }
}
