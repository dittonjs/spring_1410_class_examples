package com.usu;

import com.usu.shapes.Circle;

public class Main {

    public static void main(String[] args) {
        Circle myCircle = new Circle();
        Circle myOtherCircle = new Circle(3.1);
        Circle thirdCircle = new Circle(3.1);
        System.out.println("Circle count is " + Circle.getCircleCount());
        System.out.println(myCircle.getRadius());
        System.out.println(myOtherCircle.getRadius());


        myOtherCircle.setRadius(-1.6);
        System.out.println(myCircle.getRadius());
        System.out.println(myOtherCircle.getRadius());
        reportCircle(myOtherCircle);
    }

    public static void reportCircle(Circle circle) {
        System.out.printf("The area the circle is %.2f.\n", circle.getArea());
    }
}


