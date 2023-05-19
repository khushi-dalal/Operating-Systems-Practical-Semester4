import java.util.Scanner;
public class Pattern2{public static void main(String Args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char curr = 'A';
        char maxi = curr;
        for (int i = 1; i <= n; i++) {
            // print spaces first
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // print chars
            char temp = maxi;
            for (int j = 1; j <= i; j++) {
                System.out.print((char) temp);
                temp--;
            }
            maxi += i + 1;

            System.out.println();
        }
    }
}
