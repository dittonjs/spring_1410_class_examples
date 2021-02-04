package com.usu;

import javax.sound.midi.Soundbank;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        Random rng = new Random();
//        double value = rng.nextDouble();
//        while(value < .5) {
//            System.out.printf("Your value is: %.2f\n", value);
//            value = rng.nextDouble();
//        }
//
//        Scanner scanner = new Scanner(System.in);
//
//        String input = "";
//        double sum = 0;
//        do {
//            System.out.print("Enter a number (type 'end' to exit): ");
//            input = scanner.next();
//            if (!input.equals("end")) {
//                sum += Double.parseDouble(input);
//            }
//        } while (!input.equals("end"));
//        System.out.printf("Your sum is %.2f.", sum);
////
//        int myStartingPoint = 0;
//
//        for(int i = 0, j = 9; i < 10 && j > -1; i++, j--) {
//            // loop
//            System.out.printf("%d and %d\n", i, j);
//        }
//        System.out.println(i);


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 2 numbers: ");

        int gcd = 1;
        int guess = 2;

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        while(guess <= num1 && guess <= num2) {

        }

    }
}
