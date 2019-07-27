package com.kodilla.stream.immutable;

public final class ForumUser {
    private final String username;
    private final String RealName;

    public ForumUser(final String username, final String realName) {
        this.username = username;
        RealName = realName;
    }

    public String getUsername() {
        return username;
    }

    public String getRealName() {
        return RealName;
    }
}
