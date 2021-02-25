package com.usu;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
	// write your code here
        int num = 10;
        int Num = 20;
        int[] data = {3, 6, 14, 65, 23, 43, 102, 47, 129, 19};
        selectionSort(data);
        int searchValue = 100;
        String myString = "asdfasdf";
        if (binarySearch(data, searchValue)) {
            System.out.println("You found the value");
        } else {
            System.out.println("You did not find the value");
        }
        final double PI = 3.1415;
        final double GRAVITY = 9.8;
        final int MAX_VALUE = 20000;


        double radius = 4;
        double area = PI * radius * radius;

        Scanner input = new Scanner(System.in);

        int value1 = 10;
        double value2 = value1;

        double value3 = 10.9999999 + 2;
        int value4 = (int)value3;

        boolean mybool = true && true;

        if (!true && !false) {}

        if (true || false) {

        }

        if (1 == 10) {

        }

        String myString = "asdf\" \n"
        int[] values = new int[2];
        int[] values2 = {1,2,3,4};














    }

    public static boolean linearSearch(int[] data, int searchValue) {
        for (int i = 0; i<data.length; i++) {
            if (data[i] == searchValue) {
                return true;
            }
        }
        return false;
    }
    // O(log2(n))
    public static boolean binarySearch(int[] data, int searchValue) {
        int start = 0;
        int end = data.length - 1;
        while(start <= end) {
            int middle = (start + end) / 2;
            if (data[middle] == searchValue) {
                return true;
            } else if (data[middle] < searchValue) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        return false;
    }


    // O(n^2)
    public static void bubbleSort(int[] data) {
        boolean didSwap = false;
        do {
            didSwap = false;
            for (int i = 0; i < data.length - 1; i++) {
                if (data[i] > data[i + 1]) {
                    int temp = data[i];
                    data[i] = data[i + 1];
                    data[i + 1] = temp;
                    didSwap = true;
                }
            }
        } while(didSwap);
    }

    // O(n^2)
    public static void selectionSort(int[] data) {
        for (int start = 0; start < data.length - 1; start ++) {
            int minPos = start;
            for (int scan = start + 1; scan < data.length; scan ++) {
                if (data[scan] < data[minPos]) {
                    minPos = scan;
                }
            }

            int temp = data[start];
            data[start] = data[minPos];
            data[minPos] = temp;
        }
    }

}

