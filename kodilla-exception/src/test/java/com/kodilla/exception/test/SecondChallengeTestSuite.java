package com.kodilla.exception.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SecondChallengeTestSuite {

    @Test
    void TestSecondChallenge() {
        // given
        SecondChallenge secondChallenge = new SecondChallenge();
        // when & then
       assertAll(
               () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2,1)),
               () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(1.5,1.5)),
               () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2,1.5)),
               () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1,2))
       );
    }
}
