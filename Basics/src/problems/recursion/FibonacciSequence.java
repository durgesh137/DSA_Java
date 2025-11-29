package problems.recursion;

/**
 * Fibonacci Sequence Calculator - Iterative and Recursive Approaches
 * Time Complexity: O(n) for both approaches
 * Space Complexity: O(1) for iterative, O(n) for recursive due to call stack
 * Sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
 */
public class FibonacciSequence {
    /**
     * Computes the nth Fibonacci number iteratively
     * @param n the position in the Fibonacci sequence
     * @return the nth Fibonacci number
     */
    public static long fibonacciIterative(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Fibonacci is not defined for negative numbers.");
        }
        if (n == 0) return 0;
        if (n == 1) return 1;

        long a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            long temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }

    /**
     * Computes the nth Fibonacci number recursively
     * @param n the position in the Fibonacci sequence
     * @return the nth Fibonacci number
     */
    public static long fibonacciRecursive(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Fibonacci is not defined for negative numbers.");
        }
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public static void main(String[] args) {
        int[] testCases = {0, 1, 2, 3, 5, 10, 20, 30};

        System.out.println("Fibonacci Sequence Calculator\n");

        for (int n : testCases) {
            long iterativeResult = fibonacciIterative(n);
            long recursiveResult = fibonacciRecursive(n);
            System.out.printf("Fibonacci of %2d -> Iterative: %15d, Recursive: %15d\n", n, iterativeResult, recursiveResult);
        }
    }
}
