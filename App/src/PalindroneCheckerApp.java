public class PalindromeCheckerApp {

    // Application constants
    private static final String APP_NAME = "PalindromeChecker App";
    private static final String VERSION = "v1.0.0";

    public static void main(String[] args) {

        displayWelcomeMessage();

        // Future feature:
        // Continue to next use case (e.g., prompt user for input)
        // or exit application
    }

    private static void displayWelcomeMessage() {
        System.out.println("===================================");
        System.out.println("Welcome to " + APP_NAME);
        System.out.println("Version: " + VERSION);
        System.out.println("===================================");
    }
}