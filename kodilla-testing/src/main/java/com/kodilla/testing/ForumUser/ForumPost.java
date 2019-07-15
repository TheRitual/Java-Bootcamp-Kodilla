package com.kodilla.testing.ForumUser;

import java.sql.Timestamp;
import java.util.Objects;
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

    public String getAuthorUuid() {
        return authorUuid;
    }

    public String getBody() {
        return body;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public String getUuid() {
        return uuid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ForumPost forumPost = (ForumPost) o;
        return timeStamp == forumPost.timeStamp &&
                authorUuid.equals(forumPost.authorUuid) &&
                uuid.equals(forumPost.uuid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorUuid, timeStamp, uuid);
    }
}
