package com.usu;

import com.usu.shapes.Circle;
import com.usu.shapes.Rectangle;
import com.usu.shapes.Shape;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Shape shape = new Rectangle(1,1,"", true, 1,1);
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
        }
    }
}
