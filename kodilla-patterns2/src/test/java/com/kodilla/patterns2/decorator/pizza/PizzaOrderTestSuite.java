package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaOrderGetCost() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        // When
        BigDecimal calculatedCost = theOrder.getCost();
        // Then
        assertEquals(new BigDecimal(15), calculatedCost);
    }

    @Test
    public void testBasicPizzaOrderGetDescription() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        // When
        String description = theOrder.getDescription();
        // Then
        assertEquals("Pizza + tomato sauce +  ingredients : cheese", description);
    }

    @Test
    public void testBasicPizzaOrderWithHam() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new Ham(theOrder);
        // When
        String description = theOrder.getDescription();
        BigDecimal calculatedCost = theOrder.getCost();
        // Then
        assertEquals("Pizza + tomato sauce +  ingredients : cheese + ham", description);
        assertEquals(new BigDecimal(18), calculatedCost);
    }

    @Test
    public void testBasicPizzaOrderWithMultipleIngredients() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new Ham(theOrder);
        theOrder = new Salami(theOrder);
        theOrder = new ExtraCheese(theOrder);
        // When
        String description = theOrder.getDescription();
        BigDecimal calculatedCost = theOrder.getCost();
        // Then
        assertEquals("Pizza + tomato sauce +  ingredients : cheese + ham + salami + extra cheese", description);
        assertEquals(new BigDecimal(24), calculatedCost);
    }

}
