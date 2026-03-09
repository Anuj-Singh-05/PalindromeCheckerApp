import java.util.*;

/**
 * =========================================================================
 * MAIN CLASS - UseCase13PalindromeCheckerApp
 * =========================================================================
 * * Use Case 13: Performance Comparison
 * * Description:
 * This class measures and compares the execution 
 * performance of palindrome validation algorithms.
 * * At this stage, the application:
 * - Uses a palindrome strategy implementation
 * - Captures execution start and end time
 * - Calculates total execution duration
 * - Displays benchmarking results
 * * This use case focuses purely on performance
 * measurement and algorithm comparison.
 * * The goal is to introduce benchmarking concepts.
 * * @author Developer
 * @version 13.0
 */
public class UseCase13PalindromeCheckerApp {

    /**
     * Application entry point for UC13.
     * * @param args Command-line arguments
     */
    public static void main(String[] args) {
        String input = "level";

        // Using the Strategy Pattern for the comparison
        PalindromeStrategy strategy = new StackStrategy();

        // Capture start time in nanoseconds
        long startTime = System.nanoTime();

        // Execute the algorithm
        boolean isPalindrome = strategy.check(input);

        // Capture end time in nanoseconds
        long endTime = System.nanoTime();

        // Calculate total execution duration
        long duration = endTime - startTime;

        // Display results
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
        System.out.println("Execution Time : " + duration + " ns");
    }
}

/**
 * INTERFACE - PalindromeStrategy
 * Contract for algorithms to be benchmarked.
 */
interface PalindromeStrategy {
    boolean check(String input);
}

/**
 * CLASS - StackStrategy
 * Stack-based implementation used for the performance test.
 */
class StackStrategy implements PalindromeStrategy {
    @Override
    public boolean check(String input) {
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            stack.push(c);
        }
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}
