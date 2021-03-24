package com.usu;

public class Circle {
    private static int circleCount = 0;
    private double radius;

    public Circle() {
        circleCount ++;
        this.radius = 1;
    }

    public Circle(double radius) {
        this.setRadius(radius);
        circleCount ++;
    }

    private void setRadius(double radius) {
        if (radius < 1) {
            this.radius = 1;
        } else {
            this.radius = radius;
        }
    }

    public static int getCircleCount() {
        return circleCount;
    }

    //    public double getArea() {
//        return Math.PI * radius * radius;
//    }
//
//    public double getCircumference() {
//        return 2 * Math.PI * radius;
//    }
//
//    public double getDiameter() {
//        return radius * 2;
//    }
////
//    private double getRadius() {
//        return radius;
//    }

    public void draw() {
        // draws a circle
        System.out.println("o");
    }
}
