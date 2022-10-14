package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
class CalculatorTestSuite {

    @Autowired
    Calculator calculator;


    @Test
    void testCalculations() {

        //Given

        // When
        double adding = calculator.add(5, 5);
        double dividing = calculator.div(5, 5);
        double multiplying = calculator.mul(5, 5);
        double subtracting = calculator.sub(5, 5);
        // Then
        assertEquals(adding, 10);
        assertEquals(dividing, 1);
        assertEquals(multiplying, 25);
        assertEquals(subtracting, 0);

    }


}
