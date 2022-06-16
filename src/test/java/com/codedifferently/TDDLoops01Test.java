package com.codedifferently;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TDDLoops01Test {
    private TDDLoops01 numbers;
    @BeforeEach
    public void beforeEach() {
        numbers = new TDDLoops01();
    }
    @Test
    public void oneToTenTest() {
        //: Given
        String expected = "oneToTen()\n*** Output ***\n1\n2\n3\n4\n5\n6\n7\n8\n9\n10";
        //: When
        String actual = numbers.oneToTen();
        //: Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void oddNumbersTest() {
        //: Given
        String expected ="oddNumbers()\n*** Output ***\n1\n3\n5\n7\n9\n11\n13\n15\n17\n19";
        //: When
        String actual = numbers.oddNumbers();
        //: Then

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void squaresTest() {
        //: Given

        String expected = "squares()\n*** Output ***\n1\n4\n9\n16\n25\n36\n49\n64\n81\n100";
        //: When
        String actual = numbers.squares(10);

        //: Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void random4Test() {
        //: Given

        //: When

        //: Then
    }

    @Test
    public void evenTest() {
        //: Given
        String expected = "even()\n*** Output ***\n0\n2\n4\n6\n8\n10";
        //: When
        String actual = numbers.even(10);
        //: Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void powersTest(){
        //: Given
        String expected = "powers()\n*** Output ***\n0\n4\n2\n4\n6\n8\n10";
        //: When
        String actual = numbers.powers(10);
        //: Then
    }
}
