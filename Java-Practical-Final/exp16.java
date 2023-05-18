// Write a program that calculates the factorial of a given number. The factorial of a number is the product of all positive integers less than or equal to that number.
import java.util.Scanner;

public class exp16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to find factorial: ");
        int n = sc.nextInt();
        int fact = findFactorial(n);
        System.out.println("The factorial is: " + fact);
    }
    static int findFactorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n*findFactorial(n-1);
        }
    }
}