package com.kodilla.stream.world;


import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {

        //Given
        World world = new World();

        Continent europe = new Continent("Europa");
        Continent asia = new Continent("Asia");
        Continent africa = new Continent("Africa");

        Country poland = new Country("Poland", new BigDecimal("37765034"));
        Country germany = new Country("Germany", new BigDecimal("84316340"));
        Country iceland = new Country("Iceland", new BigDecimal("345677"));
        Country japan = new Country("Japan", new BigDecimal("126476461"));
        Country southKorea = new Country("SouthKorea", new BigDecimal("51269185"));
        Country senegal = new Country("Senegal", new BigDecimal("16743927"));

        world.addContinent(europe);
        world.addContinent(asia);
        world.addContinent(africa);

        europe.addCountry(poland);
        europe.addCountry(germany);
        europe.addCountry(iceland);

        asia.addCountry(japan);
        asia.addCountry(southKorea);

        africa.addCountry(senegal);

        // When

        BigDecimal totalPeople = world.getPeopleQuantity();

        // Then
        BigDecimal expectedPeople = new BigDecimal("316916624");
        assertEquals(totalPeople, expectedPeople);
    }
}







