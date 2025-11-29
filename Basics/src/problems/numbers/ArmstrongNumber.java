package problems.numbers;

/**
 * Armstrong Number Checker
 * An Armstrong number (or narcissistic number) is a number that is equal to the sum of its own digits each raised to the power of the number of digits.
 * For example, 153 is an Armstrong number because 1^3 + 5^3 + 3^3 = 153.
 */
public class ArmstrongNumber {
    /**
     * Checks if a number is an Armstrong number
     * @param num
     * @return
     */
    public static boolean isArmstrong(int num) {
        int original = num;
        int sum = 0;
        //find number of digits
        int digits = String.valueOf(num).length();

        // Calculate the sum of each digit raised to the power of number of digits
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }

        return sum == original;
    }

    public static void main(String[] args) {
        int[] testCases = {153, 370, 371, 9474, 123, 0, 1, 407};

        System.out.println("Armstrong Number Checker\n");

        for (int num : testCases) {
            boolean result = isArmstrong(num);
            System.out.printf("%6d -> %5s\n", num, result);
        }
    }
}
