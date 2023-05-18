// Write a Java program to check the eligibility of a person to vote as a citizen of India. The program should take the person's age and country as input, and display the message "You are eligible to vote!" if the person is 18 years or older and their country is "India". Otherwise, display the message "You are not eligible to vote."
import java.util.Scanner;

public class exp24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        input.nextLine(); 
        System.out.print("Enter your country: ");
        String country = input.nextLine();

        // Check eligibility
        if (age >= 18 && country.equalsIgnoreCase("India")) {
            System.out.println("You are eligible to vote!");
        } else {
            System.out.println("You are not eligible to vote.");
        }
    }
}
