
// Create a Java class named Rectangle to represent a rectangle. The class should have two instance variables: length and width. The class should have three constructors:
// 1.	A default constructor that initializes length and width to 1.
// 2.	A constructor that accepts one argument and initializes both length and width to the value of the argument.
// 3.	A constructor that accepts two arguments and initializes length and width to the respective arguments.


public class  exp8{
public static void main(String Args[]){
        Rectangle r = new Rectangle();
        System.out.println(r.getLength());
    }
}
class Rectangle {
    
    private double length;
    private double width;

    // Default constructor
    public Rectangle() {
        this.length = 1;
        this.width = 1;
    }

    // Constructor with one argument
    public Rectangle(double size) {
        this.length = size;
        this.width = size;
    }

    // Constructor with two arguments
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Getters and setters for length and width
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    // Method to calculate area of rectangle
    public double calculateArea() {
        return length * width;
    }

    // Method to calculate perimeter of rectangle
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}
