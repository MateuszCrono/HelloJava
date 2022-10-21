package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacBuilderTestSuite {

    @Test
    void BigmacBuilderTest() {

        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun(Rolltype.CLASSIC)
                .sauce(SauceType.MAYO)
                .burgers(2)
                .ingredient(IngredientsType.LETTUCE)
                .ingredient(IngredientsType.ONION)
                .ingredient(IngredientsType.CHEESE)
                .build();

        System.out.println(bigmac);

        assertEquals(3,bigmac.getIngredients().size());
        assertEquals(2,bigmac.getBurgers());
        assertEquals(Rolltype.CLASSIC,bigmac.getRoll());
        assertEquals(SauceType.MAYO, bigmac.getSauce());
        }
    }
