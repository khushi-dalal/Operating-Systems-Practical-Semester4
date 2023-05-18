// Replace a specific character in a given string with another character based on user input and display the result.
import java.util.Scanner;
public class exp21{
    public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String myString = sc.nextLine();
        System.out.println("Enter character to be replaced: ");
        String char1 = sc.nextLine();
        System.out.println("Enter character to replace it with: ");
        String char2= sc.nextLine();
        String replacedString = myString.replace(char1, char2);
        System.out.println("Original String: " +myString);
        System.out.println("Replaced String: " + replacedString);
    }
}