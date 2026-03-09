import java.util.Scanner;

/**
 * =========================================================================
 * MAIN CLASS - UseCase3PalindromeCheckerApp
 * =========================================================================
 * * Use Case 3: Reverse String Based Palindrome Check
 * * Description:
 * This class checks whether a string is a palindrome
 * by reversing the string and comparing it with
 * the original value.
 * * At this stage, the application:
 * - Iterates the string in reverse order
 * - Builds a reversed version
 * - Compares original and reversed strings
 * - Displays the validation result
 * * This introduces transformation-based validation.
 * * @author Developer
 * @version 3.0
 */
public class UseCase3PalindromeCheckerApp {

    /**
     * Application entry point for UC3.
     * * @param args Command-line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Get user input
        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();
        
        // We'll keep a version for comparison (often palindromes ignore case)
        String original = input.toLowerCase();
        String reversed = "";

        // 2. Reverse string using loop (As per Hint)
        // We iterate from the last character (length - 1) down to 0
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }

        // 3. Compare original and reversed using .equals()
        // 4. Display result
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);

        if (original.equals(reversed)) {
            System.out.println("Result: The string is a palindrome.");
        } else {
            System.out.println("Result: The string is NOT a palindrome.");
        }

        scanner.close();
    }
}
