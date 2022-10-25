package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacBuilderTestSuite {

    @Test
    void BigmacBuilderTest() {

        // Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun(Rolltype.CLASSIC)
                .sauce(SauceType.MAYO)
                .burgers(2)
                .ingredient(IngredientsType.LETTUCE)
                .ingredient(IngredientsType.ONION)
                .ingredient(IngredientsType.CHEESE)
                .build();
        // When
        System.out.println(bigmac);
        int ingredientsSize = bigmac.getIngredients().size();
        int burgersAmount = bigmac.getBurgers();
        Rolltype burgerBunType = bigmac.getRoll();
        SauceType burgerSauce = bigmac.getSauce();

        // Then
        assertEquals(3, ingredientsSize);
        assertEquals(2, burgersAmount);
        assertEquals(Rolltype.CLASSIC, burgerBunType);
        assertEquals(SauceType.MAYO, burgerSauce);
        }
    }
