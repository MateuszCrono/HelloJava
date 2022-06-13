package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {

    OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @DisplayName
            ("when create empty list")
    @Test
    void testOddNumbersExterminatorEmptyList()
    {
        //Given
        ArrayList<Integer> emptyList = new ArrayList<>();

        //When
        List<Integer> resultList = oddNumbersExterminator.exterminate(emptyList);
        System.out.println("Testing list should be empty -> " + resultList.toString());
        // Then
        Assertions.assertEquals(resultList, emptyList);
    }
    @DisplayName("When there are odd and even numbers")
    @Test
    void testOddNumbersExterminatorNormalList()
    {
        // Given
        ArrayList<Integer> mixedList = new ArrayList<>();

        mixedList.add(3);
        mixedList.add(4);
        mixedList.add(12);
        mixedList.add(11);

        ArrayList<Integer> expectedList = new ArrayList<>();

        expectedList.add(4);
        expectedList.add(12);

        // When
        List<Integer> mixedListResult = oddNumbersExterminator.exterminate(mixedList);
        System.out.println("Testing list should only show even numbers -> " + mixedListResult.toString());
        // Then
        Assertions.assertEquals(mixedListResult, expectedList);
    }

}
