package com.usu;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] data = {3, 6, 14, 65, 23, 43, 102, 47, 129, 19};
        bubbleSort(data);
        int searchValue = 100;
        if (binarySearch(data, searchValue)) {
            System.out.println("You found the value");
        } else {
            System.out.println("You did not find the value");
        }

        final Dog myDog = new Dog();
        final Dog myDog2 = myDog;
        final Dog myDog3 = myDog;
        myDog3 = myDog2;

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

    public static void selectionSort(int[] data) {

    }

}
