// Write a program that takes a string as input and counts the number of vowels (a, e, i, o, u) in the string.
import java.util.Scanner;

public class exp17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String to count vowels: ");
        String str = sc.nextLine();
        int vow = findVowels(str);
        System.out.println("The number of vowels is: " + vow);
    }
    static int findVowels(String str){
        int len = str.length();
        int vow=0;
        str = str.toLowerCase();
        for(int i=0;i<len;i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' ){
                vow++;
            }
        }
        return vow;
    }
}