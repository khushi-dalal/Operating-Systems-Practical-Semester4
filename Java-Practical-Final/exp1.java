// Write a Java program to generate the Fibonacci series up to a given number 'n'. The Fibonacci series is a sequence of numbers where each number is the sum of the two preceding ones.
import java.util.*;
public class exp1{
    public static void main(String Args[]){
        int n;
        int n1=0,n2=1,n3;
        System.out.println("Enter n: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println(n1+"\n"+n2);
        for(int i=2;i<n;i++){
            n3=n1+n2;
            System.out.println(n3);
            n1=n2;
            n2=n3;
        }
    }
}