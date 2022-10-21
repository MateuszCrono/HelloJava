package com.kodilla.testing.loop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestLoopAndConditionalBreakpoints {
    @Test
    public void TestLoop() {
        // Given
        long sum = 0;
        // when
        for (int n = 0; n < 1000; n++) {
            sum += n;
            System.out.println("{" + n + "} Sum Equals " + sum);
        }
        // Then
        assertEquals(499500, sum);
    }
}
