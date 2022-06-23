package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.Objects;

public class ForumUser {

    private final int id;
    private final String userName;
    private final char gender;

    private final LocalDate birthDay;
    private final int postCount;


    public ForumUser(final int id, final String userName, final char gender, final LocalDate birthDay, final int postCount) {
        this.id = id;
        this.userName = userName;
        this.gender = gender;
        this.birthDay = birthDay;
        this.postCount = postCount;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", gender=" + gender +
                ", birthDay=" + birthDay +
                ", postCount=" + postCount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ForumUser forumUser = (ForumUser) o;
        return id == forumUser.id && gender == forumUser.gender && postCount == forumUser.postCount && Objects.equals(userName, forumUser.userName) && Objects.equals(birthDay, forumUser.birthDay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userName, gender, birthDay, postCount);
    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public char getGender() {
        return gender;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public int getPostCount() {
        return postCount;
    }
}


