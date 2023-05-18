// Write a Java program that demonstrates the implementation of exception handling.
// Implement:
// ●	NumberFormatException
// ●	ArrayIndexOutOfBoundsException
// ●	ArithmeticException	

import java.util.Scanner;

public class exp25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // NumberFormatException
        try {
            System.out.print("Enter a number: ");
            String str = sc.nextLine();
            int num = Integer.parseInt(str);
            System.out.println("You entered: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter a valid number.");
        }
        
        // ArrayIndexOutOfBoundsException
        try {
            int[] arr = {1, 2, 3, 4, 5};
            System.out.print("Enter an index to access the array: ");
            int index = sc.nextInt();
            System.out.println("The value at index " + index + " is: " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index! Please enter a valid index");
        }
        
        // ArithmeticException
        try {
            System.out.print("Enter the numerator: ");
            int numerator = sc.nextInt();
            System.out.print("Enter the denominator: ");
            int denominator = sc.nextInt();
            int result = numerator / denominator;
            System.out.println(numerator + " / " + denominator + " = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Invalid input! Division by zero is not allowed.");
        }
        
        sc.close();
    }
}
