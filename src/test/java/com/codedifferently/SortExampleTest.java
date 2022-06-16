package com.codedifferently;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codedifferently.SortExample.selectionSort;

public class SortExampleTest {
    @Test
    @DisplayName("Selection Sort Test")

    public void selectionSortTest() {
        int [] expected = {-2,1,3,5,7,45};
        int[]numbers = {3,7,1,5,45,-2};
        int[] actual = selectionSort(numbers);
        Assertions.assertArrayEquals(expected, actual);
    }
}
