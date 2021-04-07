package com.usu;

import com.usu.shapes.Circle;
import com.usu.shapes.Rectangle;
import com.usu.shapes.Shape;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] vals = new int[10][];

        int[][] ragged = {
                {1},
                {1,2},
                {},
                {1,2,3,5}
        };
        vals[0] = new int[]{1,2,3,4,5,6};
        vals[1] = new int[15];

        Shape shape = new Rectangle(1,2,"", true, 1,1);
        ArrayList<Shape> shapes = new ArrayList();
        int[] values = new int[10];
        ArrayList<Integer> values2 = new ArrayList<>();
        values2.add(3);
        System.out.println("Length is: " + shapes.size());
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Enter a shape: (either 'rect' or 'circle'). Enter done to quit: ");
            String input = scanner.next();
            if (input.equals("done")) {
                break;
            }
            if (input.equals("rect")) {
                shapes.add(new Rectangle(1,1, "red", false, 1,1));
            }
            if (input.equals("circle")) {
                shapes.add(new Circle(1,1, "red", false, 1));
            }
        }

        drawShapes(shapes);
    }

    public static void drawShapes(ArrayList<Shape> shapes) {

        for (int i = 0; i < shapes.size(); i++) {
            Shape shape = shapes.get(i);
            shape.draw();
            if (shape instanceof Rectangle) {
                Rectangle rect = (Rectangle) shape;
            }
        }
    }

    public static void reportLarger(Shape shape1, Shape shape2) {
        if (shape1.getArea() > shape2.getArea()) {
            System.out.println("shape1 is larger");
        } else {
            System.out.println("shape2 is larger");
        }
    }
}
