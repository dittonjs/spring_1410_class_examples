package com.usu;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Cow());
        animals.add(new Camel());

        ArrayList<Plant> plants = new ArrayList<>();
        plants.add(new Apple());
        plants.add(new PoisonIvy());

        ArrayList<Edible> edibles = new ArrayList<>();
        edibles.add(new Cow());
        edibles.add(new Strawberry());
        edibles.add(new Apple());

        edibles.add();

    }
}
