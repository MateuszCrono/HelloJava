package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }


    @Nested
    @DisplayName("Tests for ShapeCollector")
    class testShapeCollector {
        @Test
        void testAddFigure() {
            // Given
            ShapeCollector shapeCollector = new ShapeCollector();
            // When
            Shape bigSquare = new Square("Square01", 150);
            shapeCollector.addFigure(bigSquare);
            // Then
            Assertions.assertEquals(shapeCollector.getFigure(0), bigSquare);
        }

        @Test
        void testRemoveFigure() {
            // Given
            ShapeCollector shapeCollector = new ShapeCollector();
            // When

            // Then

        }

        @Test
        void testGetFigure() {

            // Given

            // When

            // Then
        }

        @Test
        void testShowFigures() {

            // Given

            // When

            // Then
        }

    }

}
