// Write an abstract class program to calculate area of circle, rectangle and triangle.
import java.util.Scanner;

abstract class Shape {
    abstract double getArea();
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double getArea() {
        return length * width;
    }
}

class Triangle extends Shape {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double getArea() {
        return 0.5 * base * height;
    }
}

public class exp7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape shape;
        int choice;

        do {
            System.out.println("Enter 1 for Circle, 2 for Rectangle, 3 for Triangle, 4 to exit: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter radius of the circle: ");
                    double radius = sc.nextDouble();
                    shape = new Circle(radius);
                    System.out.println("Area of Circle: " + shape.getArea());
                    break;
                case 2:
                    System.out.println("Enter length and width of the rectangle: ");
                    double length = sc.nextDouble();
                    double width = sc.nextDouble();
                    shape = new Rectangle(length, width);
                    System.out.println("Area of Rectangle: " + shape.getArea());
                    break;
                case 3:
                    System.out.println("Enter base and height of the triangle: ");
                    double base = sc.nextDouble();
                    double height = sc.nextDouble();
                    shape = new Triangle(base, height);
                    System.out.println("Area of Triangle: " + shape.getArea());
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        } while (choice != 4);

        sc.close();
    }
}