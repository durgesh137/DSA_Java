package problems.numbers;

/**
 * Find Sum and Count of Digits in a Number
 * This program calculates the sum of digits and counts the number of digits in a given integer.
 */
public class FindSumAndDigitCount {

    /**
     * Calculates and prints the sum and count of digits in the given number
     * @param num
     */
    public static void sumAndCountDigits(int num) {
        int sum = 0;
        int count = 0;
        int temp = Math.abs(num);

        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            count++;
            temp = temp / 10;
        }

        System.out.println("Sum of digits: " + sum);
        System.out.println("Count of digits: " + count);
    }

    public static void main(String[] args) {
        int[] testCases = {12345, -123, 120, 0, 9, 1000, -5678};

        System.out.println("=== Sum and Count of Digits Test Cases ===\n");

        for (int num : testCases) {
            System.out.println("Number: " + num);
            sumAndCountDigits(num);
            System.out.println();
        }
    }
}
