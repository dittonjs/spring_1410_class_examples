package com.usu;

public class Main {

    public static void main(String[] args) {
        int[] values = {3, 6, 22, 11, 17, 45, 99, 13, 24};
        bubbleSort(values);

        for (int value : values) {
            System.out.println(value);
        }

        int[] values2 = new int[10000000];
        for (int i = 0; i < values2.length; i ++) {
            values2[i] = (int)(Math.random() * 1000000);
        }

        long start = System.currentTimeMillis();
        quickSort(values2);
        long end = System.currentTimeMillis();

        System.out.printf("Completed in %d ms", end - start);

        int[] values3 = new int[100000];
        for (int i = 0; i < values3.length; i ++) {
            values3[i] = (int)(Math.random() * 1000000);
        }

        long start2 = System.currentTimeMillis();
        bubbleSort(values3);
        long end2 = System.currentTimeMillis();
//
        System.out.printf("Completed in %d ms", end2 - start2);


	// write your code here
    }

    public static void quickSort(int[] values) {
        quickSort(values, 0, values.length - 1);
    }
    // bubble sort = n^2
    // quick sort = nlog_2(n)
    private static void quickSort(int[] values, int start, int end) {
        if (start < end) {
            int pivot = partition(values, start, end);
            quickSort(values, start, pivot - 1);
            quickSort(values, pivot + 1, end);
        }
    };

    private static int partition(int[] values, int start, int end) {
        int middle = (start + end) / 2;
        int pivotValue = values[middle];
        int pivotIndex = start;

        values[middle] = values[start];
        values[start] = pivotValue;

        for(int i = start + 1; i <= end; i++) {
            if (values[i] < pivotValue) {
                pivotIndex ++;
                int temp = values[i];
                values[i] = values[pivotIndex];
                values[pivotIndex] = temp;
            }
        }

        values[start] = values[pivotIndex];
        values[pivotIndex] = pivotValue;

        return pivotIndex;
    }

    public static void bubbleSort(int[] values) {
        for(int i = 0; i<values.length; i ++) {
            for (int j = 0; j < values.length; j ++) {
                if (values[i] < values[j]) {
                    int temp = values[i];
                    values[i] = values[j];
                    values[j] = temp;
                }
            }
        }
    }

    // partition
    // 1. puts 1 item at its correct spot in the array
    // 2. everything to the left is < than the time. Every to the right is > the item

    // STEPS
    // 1. Compute the center of the partition
    // 2. Set pivotValue value at the middle
    // 3. swap the pivot value with the first value in the partition
    // 4. Set the pivotIndex the first index in the partition
    // 5. scan the remainder of the partition
            //if value at the position  < pivotValue
                // increment pivotIndex
                // swap value at the position with the value at the new pivotIndex
    // 6 Swap the value at the pivot index with the first value in the partition and return the pivotIndex
    // int[] values = {3, 6, 22, 11, 17, 45, 99, 13, 22};
    // pivotIndex = 4;
    // {13, 6, 11, 3, 17, 45, 99, 22, 24}
    //
    // recursive sort
}
