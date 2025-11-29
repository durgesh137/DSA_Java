package problems.operations;

/**
 * Power Check
 * This class is intended to implement methods for checking if a number is a power of another number.
 * Example- isPowerOfTwo(8) -> true, isPowerOfTwo(10) -> false
 * Binary representation of few numbers-
 * 4 is 100, 5 is 101, 6 is 110, 7 is 111,
 * 8 is 1000, 16 is 10000, 32 is 100000,
 *
 */
public class PowerCheck {
    public static boolean isPowerOfTwo(int number) {
        if (number <= 0) {
            return false;
        }
        // A number is a power of two if it has exactly one bit set in its binary representation
        return (number & (number - 1)) == 0;
    }

    public static void main(String[] args) {
        int[] testCases = {1, 2, 3, 4, 5, 6,8, 16, 20, 32, 64, 100};

        System.out.println("Power of Two Checker\n");

        for (int num : testCases) {
            boolean result = isPowerOfTwo(num);
            System.out.printf("%6d -> %5s\n", num, result);
        }
    }
}
