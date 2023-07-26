package org.example;

import org.junit.jupiter.api.Test;

import static org.example.Recursive.chooseHobbyIterative;
import static org.example.Recursive.chooseHobbyRecursive;
import static org.junit.jupiter.api.Assertions.*;

class RecursiveTest {
    @Test
    void chooseHobbyIterativeTest() {
        int[] startNumbers = {21, 1, 20, 23};
        assertEquals(4, chooseHobbyIterative(startNumbers, 1));
        assertEquals(1, chooseHobbyIterative(startNumbers, 2));
        assertEquals(8, chooseHobbyIterative(startNumbers, 5));
        assertEquals(2, chooseHobbyIterative(startNumbers, 15));
    }

    @Test
    void chooseHobbyRecursiveTest() {
        int[] startNumbers = {21, 1, 20, 23};
        int[] memory = new int[15];
        assertEquals(4, chooseHobbyRecursive(startNumbers, 1, memory));
        assertEquals(1, chooseHobbyRecursive(startNumbers, 2, memory));
        assertEquals(8, chooseHobbyRecursive(startNumbers, 5, memory));
        assertEquals(2, chooseHobbyRecursive(startNumbers, 15, memory));
    }
}