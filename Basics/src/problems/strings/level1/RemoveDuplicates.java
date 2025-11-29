package problems.strings.level1;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Remove Duplicates from String
 * Removes duplicate characters while preserving the order of first occurrence.
 */
public class RemoveDuplicates {

    /**
     * method to remove duplicates using LinkedHashSet (preserves insertion order)
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     */
    public static String usingLinkedHashSet(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        Set<Character> seen = new LinkedHashSet<>();
        for (char c : str.toCharArray()) {
            seen.add(c);
        }

        StringBuilder result = new StringBuilder();
        for (char c : seen) {
            result.append(c);
        }
        return result.toString();
    }

    /**
     * method to remove duplicates using StringBuilder and indexOf check
     * Time Complexity: O(n²) - indexOf is O(n)
     * Space Complexity: O(n)
     */
    public static String usingStringBuilder(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        StringBuilder result = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (result.indexOf(String.valueOf(c)) == -1) {
                result.append(c);
            }
        }
        return result.toString();
    }

    /**
     * method to remove duplicates using boolean array (for ASCII characters)
     * Time Complexity: O(n)
     * Space Complexity: O(1) - fixed size array
     */
    public static String usingBooleanArray(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        boolean[] seen = new boolean[256]; // ASCII characters
        StringBuilder result = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (!seen[c]) {
                seen[c] = true;
                result.append(c);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String[] testCases = {
            "programming",
            "hello",
            "aabbccdd",
            "abcdefg",
            "aaa"
        };

        System.out.println("Remove Duplicates from String\n");

        for (String test : testCases) {
            System.out.printf("Input:  %-15s\n", "\"" + test + "\"");
            System.out.printf("Output: %-15s (LinkedHashSet)\n", "\"" + usingLinkedHashSet(test) + "\"");
            System.out.printf("        %-15s (StringBuilder)\n", "\"" + usingStringBuilder(test) + "\"");
            System.out.printf("        %-15s (Boolean Array)\n", "\"" + usingBooleanArray(test) + "\"");
            System.out.println();
        }
    }
}
