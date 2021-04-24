package com.usu;

import java.io.OutputStream;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BinarySearchTree bst = new BinarySearchTree();

        int[] values = {1,3,5,7,9,12,24,35,46,56};

                   //        12
        //       5                      35
        //  1        7           24            46
        //     3        9                            56
        if (bst.search(24)) {
            System.out.println("FOUND");
        } else {
            System.out.println("NOT FOUND");
        }

        bst.displayInOrder();

        bst.remove(32);

        bst.displayInOrder();

        System.out.printf("The height of the tree is: %d \n", bst.height() );
        System.out.printf("The number of leaf nodes is: %d \n", bst.numLeafNodes());
    }
}
