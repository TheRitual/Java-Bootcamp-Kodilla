package com.kodilla.testing.ForumUser;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    private List<ForumUser> usersDB;
    private List<ForumPost> postsDB;
    private List<ForumComment> commentsDB;

    public Forum() {
        this.usersDB = new ArrayList<>();
        this.postsDB = new ArrayList<>();
        this.commentsDB = new ArrayList<>();
    }


}
