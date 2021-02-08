package com.usu;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double[] numbers = new double[10];
        double[] numbersCopy = numbers;

        String[] names = {"Joseph", "Catelyn", "Soph"};
        double[] fib = {1.0, 2.0, 3.0, 5.0, 8.0};
        double[] fibCopy = fib;
        doubleValues(fibCopy);
        reportArray(fib);

        Random rng = new Random();
        for (int i = 0; i < numbers.length; i ++) {
            numbers[i] = rng.nextDouble() * 100;
        }
    }

    public static int[] copyArray(int[] values) {
        int[] copy = new int[values.length];
        for(int i = 0; i < values.length; i ++) {
            copy[i] = values[i];
        }
        return copy;
    }

    public static void doubleValues(double[] values) {
        for (int i = 0; i < values.length; i ++) {
            values[i] = values[i] * 2;
        }
    }

    public static void reportArray(double[] values) {
        System.out.print("[ ");
        for (double value : values) {
            System.out.printf("%.2f ", value);
        }
        System.out.println("]");
    }
}
