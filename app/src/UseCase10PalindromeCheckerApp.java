/**
 * =========================================================================
 * MAIN CLASS - UseCase10PalindromeCheckerApp
 * =========================================================================
 * * Use Case 10: Normalized Palindrome Validation
 * * Description:
 * This class validates a palindrome after preprocessing 
 * the input string.
 * * Normalization includes:
 * - Removing spaces and symbols
 * - Converting to lowercase
 * * This ensures the palindrome check is logical rather
 * than character-format dependent.
 * * Example:
 * "A man a plan a canal Panama"
 * * @author Developer
 * @version 10.0
 */
public class UseCase10PalindromeCheckerApp {

    /**
     * Application entry point for UC10.
     * * @param args Command-line arguments
     */
    public static void main(String[] args) {
        String input = "A man a plan a canal Panama";

        // Step 1: Normalize the string
        // Remove all non-alphanumeric characters and convert to lowercase
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        boolean isPalindrome = true;

        // Step 2: Compare characters from both ends (optimized loop)
        // We only need to iterate up to half the length
        for (int i = 0; i < normalized.length() / 2; i++) {
            // Compare symmetric characters
            if (normalized.charAt(i) != normalized.charAt(normalized.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        // Display the result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}