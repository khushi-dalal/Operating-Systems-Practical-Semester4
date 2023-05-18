// Search for a specific character or substring within a given string and display whether it is found or not.
import java.util.Scanner;

public class exp23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String originalString = input.nextLine();
        System.out.print("Enter the character or substring to search: ");
        String searchQuery = input.nextLine();
        boolean found = originalString.contains(searchQuery);
        if (found) {
            System.out.println("The search query was found in the string.");
        } else {
            System.out.println("The search query was not found in the string.");
        }
    }
}
