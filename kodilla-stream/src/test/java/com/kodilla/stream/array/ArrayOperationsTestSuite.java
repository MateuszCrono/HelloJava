package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import java.util.OptionalDouble;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage() {

            //Given
            int[] numbers = new int[]{3,5,2,17,53,4,51,35,32,63,8,12,13,15,6,1,7,11,21,5};
            //When
        Double result = ArrayOperations.getAvarage(numbers);

            //Then
            assertEquals(18.2, result);
        }
    }

