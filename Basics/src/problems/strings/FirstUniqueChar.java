package problems.strings;

import java.util.HashMap;
import java.util.Map;

/**
 * Find First Non-Repeating (Unique) Character
 * Time: O(n), Space: O(1) - fixed alphabet size
 */
public class FirstUniqueChar {

    /**
     * method to find first non-repeating character using HashMap
     * @param str
     * @return
     */
    public static char findFirstUnique(String str) {
        if (str == null || str.isEmpty()) return '\0';

        Map<Character, Integer> freq = new HashMap<>();

        // Count frequency
        for (char c : str.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        // Find first character with frequency 1
        for (char c : str.toCharArray()) {
            if (freq.get(c) == 1) {
                return c;
            }
        }

        return '\0';  // No unique character found
    }

    /**
     * method to find first non-repeating lowercase character using array
     * using fixed size array for 'a' to 'z'
     * More efficient than HashMap for lowercase letters
     * @param str
     * @return
     */
    public static char findFirstUniqueLowercase(String str) {
        if (str == null || str.isEmpty()) return '\0';

        int[] freq = new int[26];

        // Count frequency
        for (char c : str.toLowerCase().toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                freq[c - 'a']++;
            }
        }

        // Find first unique
        for (char c : str.toLowerCase().toCharArray()) {
            if (c >= 'a' && c <= 'z' && freq[c - 'a'] == 1) {
                return c;
            }
        }

        return '\0';
    }

    public static void main(String[] args) {
        String[] testCases = {
            "leetcode", "loveleetcode", "aabbcc", "programming",
            "java", "aabbccddeeff", "abcdefg"
        };

        System.out.println("First Non-Repeating Character Finder\n");
        System.out.println("String              | HashMap | Array (a-z)");
        System.out.println("--------------------|---------|------------");

        for (String test : testCases) {
            char result1 = findFirstUnique(test);
            char result2 = findFirstUniqueLowercase(test);

            String r1 = (result1 == '\0') ? "None" : "'" + result1 + "'";
            String r2 = (result2 == '\0') ? "None" : "'" + result2 + "'";

            System.out.printf("%-19s | %-7s | %-7s\n",
                "\"" + test + "\"", r1, r2);
        }
    }
}

