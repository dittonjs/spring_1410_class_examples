package com.usu;

public class Cow extends Animal implements Edible{
    @Override
    public int getCalories() {
        return 1100000;
    }

    @Override
    public void displayRecipe() {
        System.out.println("Grilled, or if you are French just eat it raw!");
    }
}
