package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {

        // Given
        User Marczelo = new Millenials("Marczelo");
        User OjciecMareczek = new YGeneration("OjciecMareczek");
        User Manianeczka = new ZGeneration("Manianeczka");

        // When
        String marczeloPublisher = Marczelo.sharePost();
        System.out.println("Marczelo is " + marczeloPublisher);
        String ojciecMareczekPublisher = OjciecMareczek.sharePost();
        System.out.println("Ojciec Mareczek is " + ojciecMareczekPublisher);
        String manianeczkaPublisher = Manianeczka.sharePost();
        System.out.println("Manianeczka is " + manianeczkaPublisher);

        // Then
        assertEquals("Snapchat user", marczeloPublisher);
        assertEquals("Facebook user", ojciecMareczekPublisher);
        assertEquals("Twitter user", manianeczkaPublisher);


    }

    @Test
    void testIndividualSharingStrategy() {

        User Marczelo = new Millenials("Marczelo");

        Marczelo.setPublisher(new FacebookPublisher());

        String marczeloPublisher = Marczelo.sharePost();
        System.out.println("Marczelo is " + marczeloPublisher);
        assertEquals("Facebook user", marczeloPublisher);
    }
}
