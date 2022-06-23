package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;


public class Forum {

    private final List<ForumUser> forumUserList = new ArrayList<>();

    public Forum() {
        forumUserList.add(new ForumUser(001,"HikaruNakamura", 'M', LocalDate.of(1986, Month.MARCH, 13), 412));
        forumUserList.add(new ForumUser(002,"MagnusCarlsen",'M', LocalDate.of(2006, Month.APRIL, 17), 353));
        forumUserList.add(new ForumUser(003,"DingLiren",'M', LocalDate.of(1993, Month.MAY, 8), 145));
        forumUserList.add(new ForumUser(004,"BethHarmon",'F', LocalDate.of(1992, Month.DECEMBER, 24), 639));
        forumUserList.add(new ForumUser(005,"BobbyFisher",'M', LocalDate.of(1945, Month.JULY, 11), 412));
    }

    public List<ForumUser>getUserList() {
        return new ArrayList<>(forumUserList);
    }


}
