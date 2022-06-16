package com.codedifferently;

public class SequentialSearch {
    public static void main(String[] args) {

    }

    static Boolean sequentialSearch(int[] numbers, int value) {
        Boolean isInArray = false;
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] == value) {
                System.out.println("The number "+ value + " is at position " + i + " in the list");
                isInArray = true;
            }//endif
        }
        System.out.println("The number "+ value + " is not in the list");
        return isInArray;
    }
}
