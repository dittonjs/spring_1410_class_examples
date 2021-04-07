package com.usu;

public class Apple extends Plant implements Edible{
    @Override
    public int getCalories() {
        return 100;
    }

    @Override
    public void displayRecipe() {
        System.out.println("Just eat it.");
    }
}
