package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.BuyPredictor;

public class User {

    private final String name;

    protected SocialPublisher socialPublisher;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String sharePost() {
        return socialPublisher.share();
    }

    public void setPublisher(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }
}
