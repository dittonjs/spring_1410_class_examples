public class BasicExpressions {
    public static void main(String[] args) {

        // different number types in order by memory consumption
        byte value0 = 1;
        short value1 = 123;
        int value2 = 57747;
        long longValue = 1;
        float value3 = 5.5f;
        double value4 = 45.66666666;

        int anotherValue = 0;

        // This results in a runtime error
//        System.out.println(10 / anotherValue);

        // basic math expressions
        double result = (45.0 / 2) + (19.5 * 6) - 3;

        System.out.print("(45.0 / 2) + (19.5 * 6) - 3 = ");
        System.out.println((45.0 / 2) + (19.5 * 6) - 3);

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // ask the user for their name and print it out
//        System.out.print("Enter your name: ");
//        String fullName = scanner.nextLine();
//        System.out.println("Welcome, " + fullName + ", we are glad you are here!");
//

//        // ask the user for a side length and print the area of a square
//        System.out.print("Enter a side length: ");
//        double sideLength = scanner.nextDouble();
//        double area = sideLength * sideLength;
//        System.out.println("The area of the square with side length " + sideLength + " is " + area);


        // ask the user for a width and height and compute the area of a rectangle
        System.out.print("Enter a width and a height: ");
        double width = scanner.nextDouble();
        double height = scanner.nextDouble();
        double area = width * height;
        System.out.println("The area of the square with width, height (" + width + ", " + height + ") is " + area);

    }
}
