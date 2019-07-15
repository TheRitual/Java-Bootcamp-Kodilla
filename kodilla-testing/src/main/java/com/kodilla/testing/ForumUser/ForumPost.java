package com.kodilla.testing.ForumUser;

import java.sql.Timestamp;
import java.util.UUID;

public class ForumPost {
    private String authorUuid;
    private String body;
    private long timeStamp;
    private String uuid;

    public ForumPost (String userUuid, String postUuid, String body) {
        this.timeStamp = new Timestamp(System.currentTimeMillis()).getTime();
        this.authorUuid = userUuid;
        this.body = body;
        this.uuid = UUID.randomUUID().toString();
    }
}
