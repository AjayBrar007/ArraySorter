package com.array;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArraySorterTest {

    @Test
    public void testSortIntegers() {
        int[] input = {5, 3, 8, 1, 2};
        int[] expectedOutput = {1, 2, 3, 5, 8};
        assertArrayEquals(expectedOutput, ArraySorter.sortIntegers(input));
    }

    @Test
    public void testSortStrings() {
        String[] input = {"banana", "apple", "cherry", "date"};
        String[] expectedOutput = {"apple", "banana", "cherry", "date"};
        assertArrayEquals(expectedOutput, ArraySorter.sortStrings(input));
    }
}
