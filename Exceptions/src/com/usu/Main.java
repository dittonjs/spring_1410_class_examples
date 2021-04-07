package com.usu;

import java.io.InvalidClassException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        Scanner scanner = new Scanner(System.in);
//        int[] vals = new int[3];
//        while(true) {
//            System.out.print("Enter 2 integers: ");
//
//            try {
//                int val1 = scanner.nextInt();
//                int val2 = scanner.nextInt();
//                int result = doDivision(val1, val2);
//                int val = vals[5];
//                System.out.printf("%d / %d = %d\n", val1, val2, result);
//            } catch (BadMathException ex) {
//                System.out.println(ex.getMessage());
//            } catch (InputMismatchException ex) {
//                System.out.println(ex.getMessage());
//                System.out.println("You must enter integers, Strings are not allowed.");
//            }
//
//            System.out.println();
//            System.out.print("Continue? (y,n):");
//            String input = scanner.next();
//            scanner.reset();
//            if (input.equals("n")) {
//                break;
//            }
//        }
        try {
            doError();
        } catch (Exception e) {
            System.out.println("CATCH IN MAIN");
        }
        System.out.println("AFTER IN MAIN");
    }

    public static int doDivision(int val1, int val2) throws Throwable {
        if (val2 != 0) {
            return val1/val2;
        } else {
            throw new BadMathException(1,0);
        }
    }

    public static void doError() throws Exception {
        try {
            doDivision(1, 0);
        } catch (Throwable ex) {

            System.out.println("CATCH IN DO ERROR");
            throw new Error("asdf");
        }

        System.out.println("AFTER IN DO ERROR");
    }
}

