package com.kodilla.patterns2.observer.forum;

import com.kodilla.patterns2.observer.homework.HomeworkTask;

public interface Observer {
    void update(ForumTopic forumTopic);
}