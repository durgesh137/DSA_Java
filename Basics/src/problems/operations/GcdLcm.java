package problems.operations;

/**
 * GCD (Greatest Common Divisor) and LCM (Least Common Multiple) Calculator
 * GCD is calculated using the Euclidean algorithm
 * LCM is calculated using the relationship LCM(a, b) = |a * b| / GCD(a, b)
 */
public class GcdLcm {

    /**
     * Computes GCD of two integers using the Euclidean algorithm
     * @param a
     * @param b
     * @return
     */
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }

    /**
     * Computes LCM of two integers using the relationship LCM(a, b) = |a * b| / GCD(a, b)
     * @param a
     * @param b
     * @return
     */
    public static int lcm(int a, int b) {
        return Math.abs(a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        int[][] testCases = {
            {48, 18},
            {56, 98},
            {101, 10},
            {0, 5},
            {5, 0},
            {-12, 15},
            {6,12}
        };

        System.out.println("GCD and LCM Test Cases\n");
        System.out.println("A    | B    | GCD  | LCM");
        System.out.println("-----+------+------+- ----");

        for (int[] pair : testCases) {
            int a = pair[0];
            int b = pair[1];
            int gcdValue = gcd(a, b);
            int lcmValue = lcm(a, b);

            System.out.printf("%-4d | %-4d | %-4d | %-4d%n", a, b, gcdValue, lcmValue);
        }
    }
}
