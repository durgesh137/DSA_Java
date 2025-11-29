package problems.recursion;

/**
 * Factorial Calculator - Iterative and Recursive Approaches
 * Time Complexity: O(n)
 * Space Complexity: O(1) for iterative, O(n) for recursive due to call stack
 */
public class Factorial {
    /**
     * Computes factorial of a number iteratively
     * @param num
     * @return
     */
    public static long factorial(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        long result = 1;
        for (int i = 2; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    /**
     * Computes factorial of a number recursively
     * @param num
     * @return
     */
    public static long factorialRecursive(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        if (num == 0 || num == 1) {
            return 1;
        }
        return num * factorialRecursive(num - 1);
    }

    public static void main(String[] args) {
        int[] testCases = {0, 1, 5, 10, 15};

        System.out.println("Factorial Calculator\n");

        for (int num : testCases) {
            long result = factorial(num);
            long factorialResult = factorialRecursive(num);
            System.out.printf("Factorial of %2d -> Iterative: %15d, Recursive: %15d\n", num, result, factorialResult);
        }
    }
}
