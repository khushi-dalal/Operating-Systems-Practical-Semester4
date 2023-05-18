// Write a program that takes an array of integers as input and finds the maximum and minimum values in the array.
import java.util.Scanner;
public class exp15{
    public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of integers in the array: ");
        int n = sc.nextInt();
        int myArray[] = new int[n];
        int max,min;
        System.out.println("Enter the integers in the array: ");
        for(int i=0;i<n;i++){
            myArray[i] = sc.nextInt();
        }
        max = myArray[0];
        min = myArray[0];
        for(int i=0;i<n;i++){
            if(myArray[i]>max){
                max=myArray[i];
            }
            if(myArray[i]<min){
                min=myArray[i];
            }
        }
        System.out.println("MAX: " + max + "\nMIN: " + min);
    }
}