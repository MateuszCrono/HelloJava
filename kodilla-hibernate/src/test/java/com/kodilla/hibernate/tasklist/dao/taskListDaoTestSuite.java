package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class taskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;
    private static final String LISTNAME = "Test 2: Learn Hibernate";

    @Test
    void testFindByLastName() {
        //Given
        TaskList taskList = new TaskList(LISTNAME, "TESTING THE LIST");
        taskListDao.save(taskList);

        //When
        String taskListData = taskList.getListName();
        List<TaskList> readTaskList = taskListDao.findByListName(taskListData);
        System.out.println(readTaskList);

        //Then
        assertEquals(LISTNAME, readTaskList.get(0).getListName());

        //CleanUp
        taskListDao.delete(taskList);
    }
}