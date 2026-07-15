package methods;

public class MethodOverloadingArea {

    // Area of Square
    static double area(double side) {
        return side * side;
    }

    // Area of Rectangle
    static double area(double length, double width) {
        return length * width;
    }

    // Area of Triangle
    static double area(double base, double height, boolean isTriangle) {
        return 0.5 * base * height;
    }

    // Area of Circle
    static double area(int radius) {
        return 3.14 * radius * radius;
    }

    public static void main(String[] args) {

        System.out.println("Area of Square = " + area(5.0));

        System.out.println("Area of Rectangle = " + area(10.0, 5.0));

        System.out.println("Area of Triangle = " + area(8.0, 4.0, true));

        System.out.println("Area of Circle = " + area(7));
    }
}