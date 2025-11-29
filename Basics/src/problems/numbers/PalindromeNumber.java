package problems.numbers;

/**
 * Check if a number is palindrome (reads same forwards and backwards)
 * Two approaches:
 * 1. Reverse the entire number and compare
 *    * Time: O(n), Space: O(1)
 * 2. Reverse half the number and compare
    * Time: O(log n), Space: O(1)
 */
public class PalindromeNumber {

    /**
     * Checks if a number is a palindrome by reversing it
     *  here we reverse the entire number and compare
     * @param num
     * @return
     */
    public static boolean isPalindrome(int num) {
        if (num < 0) return false;  // negative numbers aren't palindromes

        int original = num;
        int reversed = 0;

        while (num > 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }

        return original == reversed;
    }

    /**
     * Checks if a number is a palindrome by reversing half of it
     * Optimized to avoid overflow and unnecessary computation
     * @param num
     * @return
     */
    public static boolean isPalindromeOptimized(int num) {
        // negatives and numbers ending in 0 (except 0 itself) aren't palindromes
        if (num < 0 || (num % 10 == 0 && num != 0)) {
            return false;
        }

        int reversedHalf = 0;
        while (num > reversedHalf) {
            reversedHalf = reversedHalf * 10 + num % 10;
            num /= 10;
        }

        // even length: num == reversedHalf
        // odd length: num == reversedHalf / 10 (middle digit doesn't matter)
        return num == reversedHalf || num == reversedHalf / 10;
    }

    public static void main(String[] args) {
        int[] testCases = {121, -121, 10, 0, 9, 1221, 12321, 123, 1000, 1};

        System.out.println("Palindrome Number Checker\n");

        for (int num : testCases) {
            boolean result1 = isPalindrome(num);
            boolean result2 = isPalindromeOptimized(num);

            System.out.printf("%6d -> %5s (optimized: %5s)%s\n",
                num, result1, result2,
                result1 == result2 ? "" : " [MISMATCH!]");
        }
    }
}
