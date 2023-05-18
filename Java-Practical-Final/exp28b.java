// take multiple name inputs and store them in a vector
import java.util.Scanner;
import java.util.Vector;

public class exp28b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vector<String> studentNames = new Vector<>();

        System.out.println("Enter student names (enter 'done' to finish):");
        while (true) {
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("done")) {
                break;
            }
            studentNames.add(name);
        }

        System.out.println("Student names entered:");
        for (String name : studentNames) {
            System.out.println(name);
        }

        scanner.close();
    }
}
