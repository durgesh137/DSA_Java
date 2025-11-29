package problems.strings;

/**
 * Reverse a String - Multiple Approaches
 * Time: O(n), Space: O(n)
 */
public class ReverseString {

    /**
     * method to reverse a string using StringBuilder (most efficient)
     * @param str
     * @return
     */
    public static String reverseUsingStringBuilder(String str) {
        if (str == null || str.isEmpty()) return str;
        return new StringBuilder(str).reverse().toString();
    }

    /**
     * method to reverse a string using char array
     * @param str
     * @return
     */
    public static String reverseUsingCharArray(String str) {
        if (str == null || str.isEmpty()) return str;

        char[] chars = str.toCharArray();
        int left = 0, right = chars.length - 1;

        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }

        return new String(chars);
    }

    /**
     * method to reverse a string using recursion
     * @param str
     * @return
     */
    public static String reverseRecursive(String str) {
        if (str == null || str.length() <= 1) return str;
        return reverseRecursive(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        String[] testCases = {"hello", "Java", "a", "", "12345", "race car"};

        System.out.println("String Reversal - Three Approaches\n");

        for (String test : testCases) {
            String result1 = reverseUsingStringBuilder(test);
            String result2 = reverseUsingCharArray(test);
            String result3 = reverseRecursive(test);

            System.out.printf("Original: %-10s\n", "\"" + test + "\"");
            System.out.printf("StringBuilder: %-10s | CharArray: %-10s | Recursive: %-10s\n",
                "\"" + result1 + "\"", "\"" + result2 + "\"", "\"" + result3 + "\"");
            System.out.println();
        }
    }
}

