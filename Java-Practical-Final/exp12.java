// Concatenate two strings and display the result. Also display the length of the original strings and resultant new string.
public class exp12 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "world";
        String concatenated = s1 + " " + s2;

        System.out.println("Original strings:");
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);

        System.out.println("\nConcatenated string:");
        System.out.println(concatenated);

        int length1 = s1.length();
        int length2 = s2.length();
        int lengthConcatenated = concatenated.length();

        System.out.println("\nLength of original strings:");
        System.out.println("s1 = " + length1);
        System.out.println("s2 = " + length2);

        System.out.println("\nLength of concatenated string:");
        System.out.println(lengthConcatenated);
    }
}
