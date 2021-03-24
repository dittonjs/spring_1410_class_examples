package com.usu.shapes;

public class Rectangle extends Shape {
    int width;
    private int height;


    public Rectangle(int x, int y, String color, boolean isFilled, int width, int height) {
        super(x, y, color, isFilled);
        this.width = width;
        this.height = height;
        super.getIsFilled();
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append(super.toString() + "\n")
                .append("Width: " + width)
                .append(" Height: " + height)
                .toString();
    }

    @Override
    public boolean getIsFilled() {
        return false;
    }

    @Override
    public void draw() {
        System.out.println("[]");
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
