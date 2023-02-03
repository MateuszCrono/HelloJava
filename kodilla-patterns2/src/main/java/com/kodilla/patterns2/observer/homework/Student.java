package com.kodilla.patterns2.observer.homework;

public interface Student {

    void registerMentor(Mentor mentor);

    void notifyMentor();

    void removeMentor(Mentor mentor);

}
