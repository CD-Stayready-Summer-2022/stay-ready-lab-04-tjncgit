package com.codedifferently;

public class BubbleSortExample {
    public static void main(String[] args) {
        int[] numbers = {40, 7, 59, 4, 1};
        displayValues(numbers);
        displayValues(bubbleSort(numbers));
    }

    public static void displayValues(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\n");
    }

    public static int[] bubbleSort(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            boolean flag = false;
            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    flag = true;
                    int temp = numbers[j + 1];
                    numbers[j + 1] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        return numbers;
    }
}
