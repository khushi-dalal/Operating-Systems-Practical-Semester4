// WAP to accept students name from command line and store them in a vector.

import java.util.Scanner;
import java.util.Vector;

public class exp28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vector<String> studentNames = new Vector<>();

        System.out.print("Enter a student name: ");
        String name = scanner.nextLine();
        studentNames.add(name);

        System.out.println("Student name entered: " + name);

        scanner.close();
    }
}