package problems.numbers;

/**
 * Prime Number Checker - Multiple Approaches
 * Time complexities vary by method
 * Naive: O(n)
 * Optimized: O(sqrt(n))
 */
public class PrimeNumber {

    /**
     * Checks if a number is prime using the naive method
     * Naive approach: check all numbers from 2 to n-1
     * Time: O(n), Space: O(1)
     * @param num
     * @return
     */
    public static boolean isPrimeNaive(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;

        // Check divisibility from 2 to n-1
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }


    /**
     * Checks if a number is prime using an optimized method
     * Optimized approach: check divisibility up to sqrt(n)
     * @param num
     * @return
     */
    public static boolean isPrimeOptimized(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;  // even numbers aren't prime

        // Only check odd divisors up to sqrt(n)
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        int[] testCases = {1, 2, 3, 4, 5, 9, 11, 15, 17, 25, 29, 97, 100};

        System.out.println("Prime Number Checker - Method Comparison\n");
        System.out.println("Num | Naive | Optimized | Faster");
        System.out.println("----+-------+-----------+-------");

        for (int num : testCases) {
            boolean naive = isPrimeNaive(num);
            boolean optimized = isPrimeOptimized(num);

            System.out.printf("%3d | %5s | %9s ",
                num, naive, optimized);

            // check if result of both approach is same or not
            if (naive == optimized ) {
                System.out.println();
            } else {
                System.out.println(" [MISMATCH!]");
            }
        }

        // Performance comparison for large number
        System.out.println("\n--- Performance Test (checking 1000003) ---");
        int largeNum = 1000003;

        long start = System.nanoTime();
        boolean resultNaive = isPrimeNaive(largeNum);
        long timeNaive = System.nanoTime() - start;

        start = System.nanoTime();
        boolean resultOptimized = isPrimeOptimized(largeNum);
        long timeOptimized = System.nanoTime() - start;

        System.out.printf("Naive:     %5s - %,d ns\n", resultNaive, timeNaive);
        System.out.printf("Optimized: %5s - %,d ns (%.1fx faster)\n",
            resultOptimized, timeOptimized, (double)timeNaive/timeOptimized);
    }
}
