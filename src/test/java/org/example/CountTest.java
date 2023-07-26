package org.example;

import org.junit.jupiter.api.Test;

import static org.example.Count.countMore;
import static org.junit.jupiter.api.Assertions.*;

class CountTest {
    @Test
    void countMoreTest () {
        int[] prices = {13, 17, 19, 25, 25, 25, 25, 25, 25, 27, 30};
        assertEquals(0, countMore(prices, 31));
        assertEquals(2, countMore(prices, 26));
        assertEquals(2, countMore(prices, 25));
        assertEquals(8, countMore(prices, 20));
    }
}