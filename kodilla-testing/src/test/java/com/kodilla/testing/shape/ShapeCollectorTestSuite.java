package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

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
    class TestShapeCollector {
        @DisplayName("Testing Adding a figure")
        @Test
        void testAddFigure() {
            // Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape bigSquare = new Square(150);
            // When
            shapeCollector.addFigure(bigSquare);
            // Then
            assertEquals(bigSquare, shapeCollector.getFigure(0));
        }

        @DisplayName("Testing removing of the figure")
        @Test
        void testRemoveFigure() {
            // Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape smallCircle = new Circle(10);
            // When
            shapeCollector.addFigure(smallCircle);
            // Then
            boolean result = shapeCollector.removeFigure(smallCircle);
            assertTrue(result);
            assertEquals(0, shapeCollector.getShapeListSize());
        }

        @DisplayName("Testing getting the figure")
        @Test
        void testGetFigure() {

            // Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape smallTriangle = new Triangle(50);
            Shape mediumTriangle = new Triangle(100);
            Shape bigTriangle = new Triangle(150);
            // When
            shapeCollector.addFigure(smallTriangle);
            shapeCollector.addFigure(mediumTriangle);
            shapeCollector.addFigure(bigTriangle);
            // Then
            assertEquals(smallTriangle, shapeCollector.getFigure(0));
            assertEquals(mediumTriangle, shapeCollector.getFigure(1));
            assertEquals(bigTriangle, shapeCollector.getFigure(2));
        }

        @DisplayName("Testing showing all Figures in Array")
        @Test
        void testShowFigures() {

            // Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape smallCircle = new Circle(20);
            Shape bigCircle = new Circle(200);
            // When
            shapeCollector.addFigure(smallCircle);
            shapeCollector.addFigure(bigCircle);
            List<Shape> shapeExpectedList = shapeCollector.getShapeList();
            // Then
            assertEquals(shapeExpectedList.toString(), shapeCollector.showFigures());
        }

    }

}
