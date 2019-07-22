package com.kodilla.testing.ForumUser;

import java.util.Objects;
import java.util.UUID;

public class ForumUser {
    private String username;
    private String realName;
    private String uuid;

    public ForumUser(String username, String realName) {
        this.username = username;
        this.realName = realName;
        this.uuid = UUID.randomUUID().toString();
    }

    public String getUsername() {
        return username;
    }

    public String getRealName() {
        return realName;
    }

    public String getUuid() {
        return uuid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ForumUser forumUser = (ForumUser) o;
        return uuid.equals(forumUser.uuid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuid);
    }
}
