package problems.strings.level1;

/**
 * Digit Validator
 * Check if a string contains only numeric characters (0-9).
 */
public class DigitValidator {

    /**
     * method to check if a string contains only digits
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     * @param str
     * @return
     */
    public static boolean isDigitOnly(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }

        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }


    /**
     * method to check if a string contains only digits using regex
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     * @param str
     * @return
     */
    public static boolean isDigitOnlyRegex(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        return str.matches("\\d+");
    }

    /**
     * method to check if a string contains only digits using ASCII values
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     * @param str
     * @return
     */
    public static boolean isDigitOnlyASCII(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }

        for (char c : str.toCharArray()) {
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] testCases = {
            "12345",
            "123a45",
            "0",
            "abc123",
            "12.34",
            "",
            "999999"
        };

        System.out.println("Check if String Contains Only Digits\n");

        for (String test : testCases) {
            System.out.printf("Input: %-15s | ", "\"" + test + "\"");
            System.out.printf("isDigit: %-5b | ", isDigitOnly(test));
            System.out.printf("Regex: %-5b | ", isDigitOnlyRegex(test));
            System.out.printf("ASCII: %-5b\n", isDigitOnlyASCII(test));
        }
    }
}
