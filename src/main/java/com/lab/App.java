package com.lab;

public class App {

    public static int sumArray(int[] numbers) {
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Array elements:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println();
        System.out.println("Sum of array elements: "
                + sumArray(numbers));
    }
}