package com.codedifferently;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codedifferently.BubbleSortExample.bubbleSort;

public class BubblSortTest {
    @Test
    @DisplayName("Bubble Sort Test")

    public void bubbleSortTest() {
        int[] numbers = {40, 7, 59, 4, 1};
        int[] expected = {1, 4, 7, 40, 59};
        int[] actual = bubbleSort(numbers);
        Assertions.assertArrayEquals(expected, actual);
    }
}
