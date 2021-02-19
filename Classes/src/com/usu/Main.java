package com.usu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Circle myCircle = new Circle(4.5);
        myCircle.circleCount = 10;
        Circle myOtherCircle = new Circle(3.1);
        System.out.println("Circle count is " + Circle.getCircleCount());
        System.out.println(myCircle.radius);
        System.out.println(myOtherCircle.radius);


        myOtherCircle.radius = 1.6;
        System.out.println(myCircle.radius);
        System.out.println(myOtherCircle.radius);
        Main myMain = new Main();
        myMain.reportCircle(myCircle);
    }

    public static void reportCircle(Circle circle) {
        System.out.printf("The area the circle is %.2f.\n", circle.getArea());
    }
}

class Circle {
    static int circleCount = 0;
    double radius;

    Circle() {
        radius = 1.0;
    }

    Circle(double radius) {
        this.radius = radius;
    }

    double getArea() {
        Circle.getCircleCount();
        return Math.PI * radius * radius;
    }

    static int getCircleCount() {
        return circleCount;
    }
}
