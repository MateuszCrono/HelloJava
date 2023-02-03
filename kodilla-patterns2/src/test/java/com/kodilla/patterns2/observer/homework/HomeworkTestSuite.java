package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomeworkTestSuite {


    @Test
    public void testUpdate() {
        //Given
        Mentor jakub = new Mentor("Jakub");
        Mentor andrzej = new Mentor("Andrzej");
        HomeworkTask mateusz = new HomeworkTask("Mateusz");
        HomeworkTask ewa = new HomeworkTask("Ewa");
        HomeworkTask szymon = new HomeworkTask("Szymon");
        mateusz.registerMentor(jakub);
        ewa.registerMentor(jakub);
        szymon.registerMentor(andrzej);
        szymon.registerMentor(jakub);

        //When
        mateusz.addTask("exercise 1");
        ewa.addTask("exercise 1");
        mateusz.addTask("exercise 2");
        szymon.addTask("exercise 1");
        mateusz.addTask("exercise 3");
        szymon.addTask("exercise 2");

        //Then
        assertEquals(6, jakub.getUpdateCount());
        assertEquals(2, andrzej.getUpdateCount());
    }
}