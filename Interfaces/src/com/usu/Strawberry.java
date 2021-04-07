package com.usu;

import java.io.Serializable;

public class Strawberry extends Plant implements Edible, Comparable, Serializable {
    @Override
    public int getCalories() {
        return 80;
    }

    @Override
    public void displayRecipe() {
        System.out.println("Put in salad");
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
