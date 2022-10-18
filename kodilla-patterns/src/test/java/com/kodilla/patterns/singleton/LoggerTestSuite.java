package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class LoggerTestSuite {

    private static Logger logger;

    @BeforeAll
    public static void openLogFile() {
        logger = Logger.INSTANCE;
        logger.log("Test number 1");
    }

    @Test
    void TestLastLog() {
        // Given
        // When
        String result = logger.getLastLog();
        // Then
        System.out.println(result);
        assertEquals("Test number 1", result);
    }
}

