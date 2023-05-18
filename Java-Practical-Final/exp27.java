// WAP that reads a positive integer from command line and count the number of digits the number has.
import java.util.Scanner;
public class exp27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();
        if (number <= 0) {
            System.out.println("Invalid input! Please enter a positive integer.");
            return;
        }

        int digitCount=0;
        int temp = number;
        while(temp!=0){
            temp/=10;
            digitCount++;
        }

        System.out.println("The number of digits in " + number + " is: " + digitCount);
        sc.close();
    }
}
