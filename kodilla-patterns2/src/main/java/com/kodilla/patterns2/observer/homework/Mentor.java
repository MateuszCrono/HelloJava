package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {

    private final String name;
    private int updateCount;

    public Mentor(String name) {
        this.name = name;
    }

    @Override
    public void update(HomeworkTask homeworkTask) {
        System.out.println(name + ": New messages in topic " + homeworkTask.getName() + "\n" +
                " (total: " + homeworkTask.getTasks().size() + " messages)");
        updateCount++;
    }

    public String getname() {
        return name;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
