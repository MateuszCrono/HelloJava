package com.kodilla.testing.forum.statistics;

public class ForumStatistics {

    private int userCount;
    private int postCount;
    private int commentCount;
    private double postAverage;
    private double commentAverage;

    public int getUserCount() {
        return userCount;
    }

    public int getPostCount() {
        return postCount;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public double getPostAverage() {
        return postAverage;
    }

    public double getCommentAverage() {
        return commentAverage;
    }

    public double getCommentPostAverage() {
        return commentPostAverage;
    }

    private double commentPostAverage;

    public void calculateAdvStatistics(Statistics statistics) {
        userCount = statistics.usersNames().size();
        postCount = statistics.postsCount();
        commentCount = statistics.commentsCount();
        if (postCount != 0 && userCount != 0) {
            postAverage = (double) postCount / userCount;
        }
        if (commentCount != 0 && userCount != 0) {
            commentAverage = (double) commentCount / userCount;
        }
        if (commentCount > 0 && postCount > 0) {
            commentPostAverage = (double) commentCount / postCount;
        }
    }

    public String showStatistics() {
        return
                        " User Count = " + userCount +
                        " Post Count = " + postCount +
                        " Comment Count = " + commentCount +
                        " Post Average = " + postAverage +
                        " Comment Average = " + commentAverage +
                        " Comment per Post Average = " + commentPostAverage;
    }
}
