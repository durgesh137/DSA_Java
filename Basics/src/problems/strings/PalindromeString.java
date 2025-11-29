package problems.strings;

/**
 * Palindrome String Checker
 * Time: O(n), Space: O(1)
 */
public class PalindromeString {

    /**
     * method to check if a string is a palindrome
     * it is case-sensitive and considers all characters
     * @param str
     * @return
     */
    public static boolean isPalindrome(String str) {
        if (str == null || str.length() <= 1) return true;

        int left = 0, right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    /**
     * method to check if a string is a palindrome
     * Ignoring case and non-alphanumeric characters
     * @param str
     * @return
     */
    public static boolean isPalindromeIgnoreCaseAndSpecial(String str) {
        if (str == null || str.length() <= 1) return true;

        int left = 0, right = str.length() - 1;

        while (left < right) {
            // Skip non-alphanumeric from left
            while (left < right && !Character.isLetterOrDigit(str.charAt(left))) {
                left++;
            }
            // Skip non-alphanumeric from right
            while (left < right && !Character.isLetterOrDigit(str.charAt(right))) {
                right--;
            }

            if (Character.toLowerCase(str.charAt(left)) !=
                Character.toLowerCase(str.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String[] testCases = {
            "racecar", "hello", "madam", "A man a plan a canal Panama",
            "Was it a car or a cat I saw?", "12321", "12345"
        };

        System.out.println("Palindrome String Checker\n");
        System.out.println("String                              | Basic  | Ignore Case/Special");
        System.out.println("------------------------------------|--------|--------------------");

        for (String test : testCases) {
            boolean basic = isPalindrome(test);
            boolean advanced = isPalindromeIgnoreCaseAndSpecial(test);

            System.out.printf("%-35s | %-6s | %-6s\n",
                "\"" + test + "\"", basic, advanced);
        }
    }
}

