package com.kodilla.spring.portfolio;

import com.kodilla.spring.reader.Reader;
import com.kodilla.spring.reader.ReaderConfig;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest

class PortfolioTestSuite {

    @Test
    void testTaskAdd() {

        // Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        // When
        String toDo = "Task in To Do List";
        String inProgress = "Tasks in Progress";
        String done = "Finished Tasks";
        board.getToDoList().addTask(toDo);
        board.getInProgressList().addTask(inProgress);
        board.getDoneList().addTask(done);

        assertEquals("Task in To Do List", board.getToDoList().getTasks().get(0));
        assertEquals("Tasks in Progress", board.getInProgressList().getTasks().get(0));
        assertEquals("Finished Tasks", board.getDoneList().getTasks().get(0));

    }
}
