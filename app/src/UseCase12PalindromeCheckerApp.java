/**
 * =========================================================================
 * MAIN CLASS - UseCase12PalindromeCheckerApp
 * =========================================================================
 * * Use Case 12: Strategy Pattern for Palindrome Algorithms
 * * Description:
 * This class demonstrates how different palindrome validation
 * algorithms can be selected dynamically at runtime using 
 * the Strategy Design Pattern.
 * * At this stage, the application:
 * - Defines a common PalindromeStrategy interface
 * - Implements a concrete Stack-based strategy
 * - Injects the strategy at runtime
 * - Executes the selected algorithm
 * * The goal is to teach extensible algorithm design.
 * * @author Developer
 * @version 12.0
 */
public class UseCase12PalindromeCheckerApp {

    public static void main(String[] args) {
        String input = "level";

        // Injecting the concrete StackStrategy at runtime
        PalindromeStrategy strategy = new StackStrategy();

        // Execution of the selected algorithm
        boolean isPalindrome = strategy.check(input);

        // Display the result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}

/**
 * INTERFACE - PalindromeStrategy
 * Defines a contract for all palindrome checking algorithms.
 */
interface PalindromeStrategy {
    boolean check(String input);
}

/**
 * CLASS - StackStrategy
 * Provides a Stack-based implementation of the PalindromeStrategy.
 * It uses LIFO behavior to reverse characters and compare them.
 */
class StackStrategy implements PalindromeStrategy {

    @Override
    public boolean check(String input) {
        // Create a stack to store characters
        java.util.Stack<Character> stack = new java.util.Stack<>();

        // Push each character of the input string onto the stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Compare characters by popping from the stack (LIFO)
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}
