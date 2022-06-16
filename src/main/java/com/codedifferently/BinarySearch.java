package com.codedifferently;

public class BinarySearch {
    public static void main(String[] args) {
        int[] numbers = {3,10,20,35,67,70};
        binarySearch(numbers, 35);

    }

    static public boolean binarySearch(int[] numbers, int value) {
        int low = 0;
        int high = numbers.length;
        while(high >= low) {
            int middle = (low + high)/2;
            if(numbers[middle] == value) {
                System.out.println("the number " + value + " is at position" + middle + " in the list") ;
                return true;
            }
            if (numbers[middle] < value) {
                low = middle + 1;
            }
            if(numbers[middle] > value) {
                high = middle - 1;
            }
        }
        System.out.println("The number "+ value + " is not in the list");
        return false;
    }

}
