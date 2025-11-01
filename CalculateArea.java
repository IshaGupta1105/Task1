class Area {
    // Method to calculate area of circle
    double calculateArea(double radius) {
        return 3.14 * radius * radius;
    }

    // Method to calculate area of square
    double calculateArea(int side) {
        return side * side;
    }

    // Method to calculate area of rectangle
    double calculateArea(double length, double breadth) {
        return length * breadth;
    }
}
public class CalculateArea {
      public static void main(String[] args) {
        Area obj = new Area();

        double circle = obj.calculateArea(5.0);
        double square = obj.calculateArea(4);
        double rectangle = obj.calculateArea(6.0, 3.0);

        System.out.println("Area of Circle = " + circle);
        System.out.println("Area of Square = " + square);
        System.out.println("Area of Rectangle = " + rectangle);
    }
}
