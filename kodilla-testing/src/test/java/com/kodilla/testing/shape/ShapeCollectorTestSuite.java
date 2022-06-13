package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

import java.util.ArrayList;

public class ShapeCollectorTestSuite {

    ShapeCollector shapeCollector = new ShapeCollector();

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
            Shape bigSquare = new Square(150);
            // When
            shapeCollector.addFigure(bigSquare);
            // Then
            Assertions.assertEquals(shapeCollector.getFigure(150), bigSquare);
        }

        @Test
        void testRemoveFigure() {
            // Given
            Shape smallCircle = new Circle(10);
            // When
            shapeCollector.addFigure(smallCircle);
            // Then
            boolean result = shapeCollector.removeFigure(smallCircle);
            Assertions.assertTrue(result);

        }

        @Test
        void testGetFigure() {

            // Given
            Shape mediumTriangle = new Triangle(50);
            // When
            shapeCollector.addFigure(mediumTriangle);
            // Then
            shapeCollector.getFigure(1);
            Assertions.assertEquals(mediumTriangle, mediumTriangle.getField()); // This is definitely wrong
        }

        @Test
        void testShowFigures() {

            // Given

            // When

            // Then
        }

    }

}
