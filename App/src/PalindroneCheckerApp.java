public class PalindroneCheckerApp {

    // Application constants
    private static final String APP_NAME = "PalindromeChecker App";
    private static final String VERSION = "v1.0.0";

    public static void main(String[] args) {

        displayWelcomeMessage();

        // Hardcoded string
        String testString = "madam";

        // Check palindrome
        boolean isPalindrome = checkPalindrome(testString);

        // Display result
        System.out.println("Testing String: " + testString);
        if (isPalindrome) {
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

    private static boolean checkPalindrome(String input) {
        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        return input.equals(reversed);
    }
}