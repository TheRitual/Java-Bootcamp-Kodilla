package com.kodilla.testing.ForumUser;

import java.sql.Timestamp;
import java.util.Objects;
import java.util.UUID;

public class ForumComment {
    private String authorUuid;
    private String body;
    private long timeStamp;
    private String uuid;
    private String postUuid;

    public ForumComment (String userUuid, String postUuid, String body) {
        this.timeStamp = new Timestamp(System.currentTimeMillis()).getTime();
        this.authorUuid = userUuid;
        this.body = body;
        this.uuid = UUID.randomUUID().toString();
        this.postUuid = postUuid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ForumComment that = (ForumComment) o;
        return timeStamp == that.timeStamp &&
                authorUuid.equals(that.authorUuid) &&
                uuid.equals(that.uuid) &&
                postUuid.equals(that.postUuid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorUuid, timeStamp, uuid, postUuid);
    }
}
