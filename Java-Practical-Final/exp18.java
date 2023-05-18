// Write a Java program that demonstrates exception handling using three different types of exceptions.
import java.util.InputMismatchException;
import java.util.Scanner;

public class exp18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            int result = 10 / 0; // This will throw an ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException occurred: " + e.getMessage());
        }

        try {
            System.out.print("Enter an integer: ");
            int number = input.nextInt(); // This will throw an InputMismatchException if a non-integer is entered
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException occurred: " + e.getMessage());
        } finally {
            input.nextLine(); // Clear the input buffer
        }

        try {
            int[] array = {1, 2, 3};
            int value = array[4]; // This will throw an ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occurred: " + e.getMessage());
        }
    }
}
