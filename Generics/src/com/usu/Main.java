package com.usu;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        GenericStack<Integer> ints = new GenericStack<>();
        ints.push(4);
        ints.push(22);
        ints.push(43);
        ints.push(9);

        GenericStack<String> cities = new GenericStack<>();
        cities.push("Logan");
        cities.push("Hyrum");
        cities.push("Providence");
        cities.push("Hyde Park");
        cities.push("Nibley");

        while (!ints.isEmpty()) {
            Integer value = ints.pop();
            System.out.printf("The value was %d \n", value);
        }
        System.out.println();
        while (!cities.isEmpty()) {
            String value = cities.pop();
            System.out.printf("The value was %s \n", value);
        }
    }


     //=====
    // =====
}
