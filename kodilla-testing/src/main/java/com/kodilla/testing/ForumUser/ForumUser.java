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

    public void addPost(){
        // do nothing
    }

    public void addComment(ForumPost thePost, String author, String commentBody){
        // do nothing
    }

    public int getPostsQuantity(){
        // return 100 temporarily
        return 100;
    }

    public int getCommentsQuantity(){
        // return 100 temporarily
        return 100;
    }

    public ForumPost getPost(int postNumber){
        // returning null means that the operation was unsuccessful
        return null;
    }

    public ForumComment getComment(int commentNumber){
        // returning null means that the operation was unsuccessful
        return null;
    }

    public boolean removePost(ForumPost thePost){
        // return true temporarily
        return true;
    }

    public boolean removeComment(ForumComment theComment){
        // return true temporarily
        return true;
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
