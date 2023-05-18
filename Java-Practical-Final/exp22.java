// Write a Java program to generate a random password of a specified length. The password should consist of a combination of uppercase letters, lowercase letters, numbers and special characters. Utilize the Random class to generate random characters.
// Example: 
// Generated Password: RtAe7tK@
import java.util.Random;

public class exp22 {
    public static void main(String[] args) {
        int length = 10;
        String password = generatePassword(length);
        System.out.println("Generated Password: " + password);
    }

    private static String generatePassword(int length) {
        String upperChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerChars = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String specialChars = "!@#$%^&*()_+-=[]{}|;':\"<>,.?/";

        Random random = new Random();

        StringBuilder passwordBuilder = new StringBuilder();

        // Add at least one uppercase letter
        passwordBuilder.append(upperChars.charAt(random.nextInt(upperChars.length())));

        // Add at least one lowercase letter
        passwordBuilder.append(lowerChars.charAt(random.nextInt(lowerChars.length())));

        // Add at least one digit
        passwordBuilder.append(numbers.charAt(random.nextInt(numbers.length())));

        // Add at least one special character
        passwordBuilder.append(specialChars.charAt(random.nextInt(specialChars.length())));

        // Generate remaining characters randomly
        for (int i = 4; i < length; i++) {
            String allChars = upperChars + lowerChars + numbers + specialChars;
            passwordBuilder.append(allChars.charAt(random.nextInt(allChars.length())));
        }

        return passwordBuilder.toString();
    }
}

