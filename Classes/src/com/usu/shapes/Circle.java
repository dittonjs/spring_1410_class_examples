package com.usu.shapes;

public class Circle {
    private static int circleCount = 0;
    private double radius;

    public Circle() {
        this(1);
    }

    public Circle(double radius) {
        circleCount ++;
        setRadius(radius);
    }

    public void setRadius(double r) {
        if (r <= 0) {
            radius = 1;
        } else {
            radius = r;
        }
    }

    public double getRadius() {
        System.out.println(circleCount);
        return radius;
    }

    public double getArea() {
        Circle.getCircleCount();
        return Math.PI * radius * radius;
    }

    public static int getCircleCount() {
        return circleCount;
    }
}