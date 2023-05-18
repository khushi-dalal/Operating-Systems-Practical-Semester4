// Create a menu driven simple calculator to calculate Addition, Subtraction, Multiplication and Division on two inputs.
import java.util.*;
public class exp3{
    public static void main(String Args[]){
        int choice;
        float a,b;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("***Calculator***\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            System.out.println("Enter first number: ");
            a = sc.nextFloat();
            System.out.println("Enter second number: ");
            b = sc.nextFloat();
            switch(choice){
                case 1:
                    System.out.println(a+b);
                break;
                case 2:
                    System.out.println(a-b);
                break;
                case 3:
                    System.out.println(a*b);
                break;
                case 4:
                    System.out.println(a/b);
                break;
                case 5:
                break;
                default:
                    System.out.println("Invalid Input");
            }
        }while(choice!=5);
    }
}