package com.vikusex;

import java.util.Scanner;

public class AverageNumberWithScanner {
    public static void main(String[] args) {
//        calculateAverage();
//        calculateAverageShorterSolution();

    }

    public static void calculateAverage() {
        Scanner in = new Scanner(System.in);
        double sum = 0;

        System.out.print("Input arr length: ");
        int numberCount = in.nextInt();
        int[] numbers = new int[numberCount];

        for (int i=0; i < numbers.length ;i++ ) {
            System.out.print("Input number: ");
            numbers[i] = in.nextInt();
        }

        System.out.println("");
        System.out.print("[");
        for (int i=0; i < numbers.length; i++ ) {
            System.out.print(numbers[i] + ",");
            sum += numbers[i];
        }
        System.out.print("]");
        System.out.println("sum = " + sum);
        double average = sum / numbers.length ;
        System.out.println("average is: " + average);
    }

    public static void calculateAverageShorterSolution() {
        Scanner in = new Scanner(System.in);
        double sum = 0;

        System.out.print("Input arr length: ");
        int numberCount = in.nextInt();

        for (int i=0; i < in.nextInt(); i++ ) {
            System.out.print("Input number: ");
            sum += in.nextInt();
        }

        System.out.println("sum is: " + sum);
        System.out.println("average is: " + sum / numberCount);
    }
}
