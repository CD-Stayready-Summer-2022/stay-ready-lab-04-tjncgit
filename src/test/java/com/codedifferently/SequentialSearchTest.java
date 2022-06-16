package com.codedifferently;
import com.codedifferently.SequentialSearch.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codedifferently.SequentialSearch.sequentialSearch;

public class SequentialSearchTest {
    @Test
    @DisplayName("Sequential Search Test")
    public void sequentialSearchTest() {
        int[] numbers = {40, 7, 59, 4, 1};
        Boolean actual = sequentialSearch(numbers, 4);
        Assertions.assertTrue(actual);
    }
}
