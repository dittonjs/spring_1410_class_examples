package com.usu;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LinkedList<Integer> myInts = new LinkedList<>();
        myInts.insert(1);
        myInts.insert(3);
        myInts.insert(7);
        myInts.insert(8);
        myInts.insert(5);
        myInts.insert(15);
        myInts.insert(22);

        myInts.displayList();

//        System.out.println(myInts.get(10));

        int[] values = {1, 1000, 200, 4000, 500, 700, 10000};
        sleepSort(values);
    }


    public static void sleepSort(int[] data) {
        for (int value: data) {
            new Thread(() -> {
                try {
                    Thread.sleep(value);
                    System.out.println(value);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}
