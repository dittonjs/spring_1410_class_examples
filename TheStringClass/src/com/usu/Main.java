package com.usu;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double result = Math.pow(2.4, 2);

        String[] myStrings = {"1", "america", "zimbabwe", "three"};
        System.out.println(String.join("-?-", myStrings));
        String myNewString = String.format("My int is %d and my double is %.2f", 3, 4.5666);
        String myString = "Hello, world. I am learning java!";
        String lower = myString.toLowerCase();
        String[] parts = myString.split(" ");
        System.out.println(myString);
        System.out.println(lower);
        System.out.println(myString.toUpperCase());
    }
}
