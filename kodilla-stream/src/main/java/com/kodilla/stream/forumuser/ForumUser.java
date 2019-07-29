package com.kodilla.stream.forumuser;

import java.time.LocalDate;

final class ForumUser {
    private final int uuid;
    private final String username;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final int amountOfPosts;

    ForumUser(final String username, final char sex, final LocalDate dateOfBirth, final int amountOfPosts){
        LocalDate time = LocalDate.now();
        this.uuid = (int) System.currentTimeMillis();
        this.username = username;
        this.dateOfBirth = dateOfBirth;
        this.amountOfPosts = amountOfPosts;

        if(sex == 'm' || sex == 'M') {
            this.sex = 'M';
        } else if (sex == 'f' || sex == 'F') {
            this.sex = 'F';
        } else {
            throw new IllegalArgumentException("Sex must be a char with value M or F");
        }

    }
}
