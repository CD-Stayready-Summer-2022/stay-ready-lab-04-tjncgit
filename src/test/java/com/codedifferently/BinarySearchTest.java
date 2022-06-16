package com.codedifferently;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codedifferently.BinarySearch.binarySearch;
import static com.codedifferently.SequentialSearch.sequentialSearch;

public class BinarySearchTest {
        @Test
        @DisplayName("Sequential Search Test")
        public void binarySearchTest() {
            int[] numbers = {3,10,20,35,67,70};
            Boolean actual = binarySearch(numbers, 20);
            Assertions.assertTrue(actual);
        }
}
