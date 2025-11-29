package problems.strings;

import java.util.Arrays;

/**
 * Anagram-check
 * Two strings are anagrams if they contain the same characters, here order does not matter.
 * Anagrams are case-insensitive
 * Time: O(n log n) sorting, O(n) frequency count
 * Space: O(1) or O(n)
 */
public class AnagramCheck {

    /**
     * method to check if two strings are anagrams using sorting
     * @param s1
     * @param s2
     * @return
     */
    public static boolean isAnagramSorting(String s1, String s2) {
        if (s1 == null || s2 == null) return false;
        if (s1.length() != s2.length()) return false;

        char[] arr1 = s1.toLowerCase().toCharArray();
        char[] arr2 = s2.toLowerCase().toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    /**
     * method to check if two strings are anagrams using frequency counting
     * more efficient than sorting
     * @param s1
     * @param s2
     * @return
     */
    public static boolean isAnagramFrequency(String s1, String s2) {
        if (s1 == null || s2 == null) return false;
        if (s1.length() != s2.length()) return false;

        int[] freq = new int[26];

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        // Increment for s1, decrement for s2
        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i) - 'a']++;
            freq[s2.charAt(i) - 'a']--;
        }

        // Check if all frequencies are 0
        for (int count : freq) {
            if (count != 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String[][] testCases = {
            {"listen", "silent"},
            {"hello", "world"},
            {"anagram", "nagaram"},
            {"rat", "car"},
            {"triangle", "integral"},
            {"apple", "papel"}
        };

        System.out.println("Anagram Checker - Two Approaches\n");
        System.out.println("String 1    | String 2    | Sorting | Frequency");
        System.out.println("------------|-------------|---------|----------");

        for (String[] pair : testCases) {
            boolean sort = isAnagramSorting(pair[0], pair[1]);
            boolean freq = isAnagramFrequency(pair[0], pair[1]);

            System.out.printf("%-11s | %-11s | %-7s | %-7s\n",
                pair[0], pair[1], sort, freq);
        }
    }
}

