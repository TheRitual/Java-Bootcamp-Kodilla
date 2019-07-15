package com.kodilla.testing.ForumUser;

import java.util.HashSet;
import java.util.UUID;

public class ForumUser {
    private String username;
    private String realName;
    private HashSet publishedPosts;
    private HashSet publishedComments;
    private String uuid;

    public ForumUser(String username, String realName) {
        this.username = username;
        this.realName = realName;
        this.publishedComments = new HashSet<ForumPost>();
        this.publishedPosts = new HashSet<ForumComment>();
        this.uuid = UUID.randomUUID().toString();
    }
}
