// Extract a substring from a given string based on user-specified indices and display the result.
import java.util.Scanner;
public class exp10{
    public static void main(String Args[]){
        String inputString;
        int startIndex,endIndex;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string: ");
        inputString = sc.nextLine();
        System.out.println("Enter the starting index: ");
        startIndex = sc.nextInt();
        System.out.println("Enter yothe ending index: ");
        endIndex = sc.nextInt();
        String substring = inputString.substring(startIndex,endIndex);
        System.out.println("The substring is: "+substring);
    }
}