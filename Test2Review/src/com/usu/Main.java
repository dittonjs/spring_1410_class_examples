package com.usu;

import java.util.ArrayList;
//Immediately upon allocation of an array of objects, the default constructor is called for each object in the array.
class Animal {

}

class Dog extends Animal{
    private String name;
    private static int dogCount = 0;

    public Dog(String name) {
        super();
        ArrayList<Integer> values;
        System.out.println("WOOF!");
        this.dogCount += 1;
        name = name;
    }

}
class Assignment {
    public Assignment() {
        score = 0;
    }

    public void setScore(double gradedScore) {
        score = gradedScore;
    }

    public double getScore() {
        return score;
    }

    private double score;
}



public class Main {

    public static void main(String[] args) {
        Assignment myAssignment = new Assignment();
        grade(myAssignment);
        System.out.println("Graded assignment: " + myAssignment.getScore());
    }

    public static void grade(Assignment toGrade) {
        toGrade.setScore(Math.random() * 100);
    }
}

class Geometry {
    protected String color;
    public Geometry() {
        System.out.println("I'm not sure who I am, yet...");

    }
    public Geometry(String color) {
        this.color = color;
    }
}


class Circle extends Geometry {
    private double radius;
    public Circle(double radius) {
        super();
        this.radius = radius;

        System.out.println("I am a Circle!");
    }
}

class Parallelogram extends Geometry {
    public Parallelogram(String color) {
        super(color);
        System.out.printf("I'm a %s parallelogram\n", this.color);
    }
}
