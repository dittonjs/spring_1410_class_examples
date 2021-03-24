package com.usu.shapes;

public abstract class Shape {
    private int x;
    private int y;
    private String color;
    private boolean isFilled;

    public Shape() {
        this.x = 10;
        this.y = 10;
        this.color = "red";
        this.isFilled = true;
        getIsFilled();
    }


    public Shape(int x, int y, String color, boolean isFilled) {
        this.x = x;
        this.y = y;
        this.color = color;
        this.isFilled = isFilled;
    }

    final public int getX() {
        return x;
    }

    final public int getY() {
        return y;
    }

    public String getColor() {
        return color;
    }

    public boolean getIsFilled() {
        return isFilled;
    }

    public void draw() {
        System.out.println("-");
    }

    public abstract double getArea();

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Shape) {
            Shape other = (Shape)obj;
            return other.x == this.x && other.y == this.y;
        }
        return false;
    }
}
