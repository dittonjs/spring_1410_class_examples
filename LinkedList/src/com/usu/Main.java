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

        System.out.println(myInts.get(10));
    }
}
