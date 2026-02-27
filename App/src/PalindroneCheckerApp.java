public class PalindroneCheckerApp {

    // Application constants
    private static final String APP_NAME = "PalindromeChecker App";
    private static final String VERSION = "v1.0.0";

    public static void main(String[] args) {

        displayWelcomeMessage();

        // Hardcoded string
        String original = "racecar";

        // Reverse the string using a loop
        String reversed = reverseString(original);

        // Compare original and reversed
        System.out.println("Original String : " + original);
        System.out.println("Reversed String : " + reversed);

        if (original.equals(reversed)) {
            System.out.println("Result: It is a palindrome.");
        } else {
            System.out.println("Result: It is NOT a palindrome.");
        }

        System.out.println("Application exiting...");
    }

    private static void displayWelcomeMessage() {
        System.out.println("===================================");
        System.out.println("Welcome to " + APP_NAME);
        System.out.println("Version: " + VERSION);
        System.out.println("===================================");
    }

    // Method to reverse string using loop
    private static String reverseString(String input) {
        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        return reversed;
    }
}