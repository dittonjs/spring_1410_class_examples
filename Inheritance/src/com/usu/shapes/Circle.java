package com.usu.shapes;

public class Circle extends Shape {
    private int radius;

    public int getRadius() {
        return radius;
    }

    public Circle(int x, int y, String color, boolean isFilled, int radius) {
        super(x, y, color, isFilled);
        this.radius = radius;

    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Circle) {
            Circle other = (Circle)obj;
            return this.radius == other.radius && super.equals(other);
        }
        return false;
    }

    @Override
    public void draw() {
        System.out.println("()");
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    //    public boolean getIsFilled(int a)
}
