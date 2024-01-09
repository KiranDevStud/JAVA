import java.util.*;


class userexcep extends Exception {
    public userexcep(String message) {
        super(message);
    }
}


public class userexcepmain {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter your age:");

            // Check if input is an integer
            if (!in.hasNextInt()) {
                throw new InputMismatchException("Please enter a valid integer for age.");
            }

            // Get the age
            int age = in.nextInt();

            if (age < 18) {
                // Throw the custom exception
                throw new userexcep("You must be at least 18 years old.");
            } else {
                System.out.println("Welcome! You are old enough.");
                // Other operations if age condition is met
            }
        } catch (InputMismatchException e) {
            // Handle input mismatch exception
            System.out.println("Input Error: " + e.getMessage());
        } catch (userexcep e) {
            // Handle the custom exception
            System.out.println("Custom Exception: " + e.getMessage());
        }
    }
}
