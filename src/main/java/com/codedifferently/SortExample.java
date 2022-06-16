package com.codedifferently;

import java.util.ArrayList;

public class SortExample {
    public static void displayAllValues(int[] numbers) {
            for(int i = 0; i< numbers.length; i++){ System.out.print(numbers[i] + " ");
            }
            System.out.println("\n");
    }
    public static int[] selectionSort(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            int indexMin = i;
            for(int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[indexMin]) {
                    indexMin = j;
                }
            }
            int temp = numbers[i];
            numbers[i] = numbers[indexMin];
            numbers[indexMin] = temp;
        }
        return numbers;
    }
    public static void main(String[] args) {
        int[]numbers = {3,7,1,5,45,-2};
        displayAllValues(selectionSort(numbers));
    }
}
