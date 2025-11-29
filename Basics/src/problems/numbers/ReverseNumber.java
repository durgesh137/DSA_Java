package problems.numbers;

/**
 * Problem: Reverse a Number
 * Description: Reverse the digits of an integer
 *
 * Examples:
 * - Input: 12345 → Output: 54321
 * - Input: -123 → Output: -321
 * - Input: 120 → Output: 21
 *
 * Time Complexity: O(log n) where n is the number (number of digits)
 * Space Complexity: O(1)
 */
public class ReverseNumber {

    /**
     * Reverses the digits of a number
     * @param num the number to reverse
     * @return reversed number
     */
    public static int reverse(int num) {
        int reversed = 0;
        int temp = Math.abs(num);

        while (temp > 0) {
            int digit = temp % 10;//getting left remainder
            reversed = reversed * 10 + digit;
            temp = temp / 10;// next temp value to operate on should be the quotient
        }

        // Handle negative numbers
        return (num < 0) ? -reversed : reversed;
    }

    /**
     * Alternative approach: Reverse using string conversion
     * @param num the number to reverse
     * @return reversed number
     */
    public static int reverseUsingString(int num) {
        boolean isNegative = num < 0;
        String numStr = String.valueOf(Math.abs(num));
        String reversedStr = new StringBuilder(numStr).reverse().toString();
        int reversed = Integer.parseInt(reversedStr);
        return isNegative ? -reversed : reversed;
    }

    public static void main(String[] args) {
        // Test cases
        int[] testCases = {12345, -123, 120, 0, 9, 1000, -5678};

        System.out.println("=== Reverse Number Test Cases ===\n");

        for (int num : testCases) {
            int result1 = reverse(num);
            int result2 = reverseUsingString(num);

            System.out.println("Original: " + num);
            System.out.println("Reversed (loop Approach): " + result1);
            System.out.println("Reversed (StringBuilder Approach): " + result2);
            System.out.println("---");
        }
    }
}

