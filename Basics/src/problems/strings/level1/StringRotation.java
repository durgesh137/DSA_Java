package problems.strings.level1;

/**
 * String Rotation Check
 * Check if one string is a rotation of another string.
 * Example: "waterbottle" is a rotation of "erbottlewat"
 */
public class StringRotation {

    /**
     * method checks rotation using concatenation trick
     * If s2 is rotation of s1, then s2 will be substring of s1+s1
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     */
    public static boolean isRotation(String s1, String s2) {
        if (s1 == null || s2 == null) {
            return false;
        }

        if (s1.length() != s2.length()) {
            return false;
        }

        if (s1.isEmpty()) {
            return true;
        }

        String concatenated = s1 + s1;
        return concatenated.contains(s2);
    }

    /**
     * method checks rotation by finding rotation point
     * Time Complexity: O(n²)
     * Space Complexity: O(1)
     */
    public static boolean isRotationManual(String s1, String s2) {
        if (s1 == null || s2 == null || s1.length() != s2.length()) {
            return false;
        }

        if (s1.isEmpty()) {
            return true;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (checkRotationAt(s1, s2, i)) {
                return true;
            }
        }
        return false;
    }

    /**
     * helper method to check rotation starting at a specific index
     * @param s1
     * @param s2
     * @param start
     * @return
     */
    private static boolean checkRotationAt(String s1, String s2, int start) {
        int n = s1.length();
        for (int i = 0; i < n; i++) {
            if (s1.charAt((start + i) % n) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[][] testCases = {
            {"waterbottle", "erbottlewat"},
            {"hello", "llohe"},
            {"abc", "bca"},
            {"abc", "acb"},
            {"abcde", "cdeab"},
            {"test", "best"}
        };

        System.out.println("String Rotation Check\n");

        for (String[] test : testCases) {
            String s1 = test[0];
            String s2 = test[1];
            boolean result1 = isRotation(s1, s2);
            boolean result2 = isRotationManual(s1, s2);

            System.out.printf("s1: %-15s s2: %-15s\n", "\"" + s1 + "\"", "\"" + s2 + "\"");
            System.out.printf("Is Rotation: %-5b (Concatenation) | %-5b (Manual)\n", result1, result2);
            System.out.println();
        }
    }
}
