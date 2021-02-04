package com.usu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        String myName = "Joseph";
//
//
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter your name: ");
//        String myName2 = scanner.next();
//
//        if (myName.equals(myName2)) {
//            System.out.println("These are equal!");
//        } else {
//            System.out.println("These are not equal!");
//        }

//        double interest = 332;
//        int length = 20;
//
//        System.out.println("Your interest is $" + interest + ".");
//        System.out.printf("Your interest is $%" + length + ".2f.\n", interest);
//
//        int num1 = 10;
//        String myName="Joseph";
//        double myDouble = 1000000000000000000.0;
//
//        System.out.printf("My values are %8d, %20s, %9.2e\n", num1, myName, myDouble);

        int square = (int)Math.pow(20000,20000);
        System.out.println(square);

        Scanner scanner = new Scanner(System.in);
        int numRow = scanner.nextInt();
        String numRowString = "" + numRow;
        int spaces = numRowString.length();
        System.out.println(spaces);
        System.out.printf("%" + spaces + "d", 4);
    }
}
