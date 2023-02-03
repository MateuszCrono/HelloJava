package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class HomeworkTask implements Student {

    private final List<Mentor> mentors;
    private final List<String> tasks;
    private final String name;

    public HomeworkTask(String name) {
        mentors = new ArrayList<>();
        tasks = new ArrayList<>();
        this.name = name;
    }

    public void addTask(String task) {
        tasks.add(task);
        notifyMentor();
    }

    @Override
    public void registerMentor(Mentor mentor) {
        mentors.add(mentor);
    }

    @Override
    public void notifyMentor() {
        for (Mentor mentor : mentors) {
            mentor.update(this);
        }
    }

    @Override
    public void removeMentor(Mentor mentor) {
        mentors.remove(mentor);
    }

    public List<String> getTasks() {
        return tasks;
    }

    public String getName() {
        return name;
    }
}

