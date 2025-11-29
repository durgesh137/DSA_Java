package problems.strings;

import java.util.HashMap;
import java.util.Map;

/**
 * Count Character Frequency in a String
 * Time: O(n), Space: O(k) where k is unique characters
 */
public class CharacterFrequency {

    /**
     * method to count frequency of each character in the string using HashMap
     * @param str
     * @return
     */
    public static Map<Character, Integer> countFrequency(String str) {
        Map<Character, Integer> freq = new HashMap<>();

        for (char c : str.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        return freq;
    }

    /**
     * method to count frequency of each lowercase character in the string using array
     * @param str
     * @return
     */
    public static int[] countFrequencyArray(String str) {
        int[] freq = new int[26];

        for (char c : str.toLowerCase().toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                freq[c - 'a']++;
            }
        }

        return freq;
    }

    /**
     * method to print frequency map
     * @param freq
     */
    public static void printFrequency(Map<Character, Integer> freq) {
        freq.forEach((ch, count) -> System.out.printf("%c:%d ", ch, count));
        System.out.println();
    }

    public static void main(String[] args) {
        String[] testCases = {"hello", "programming", "aabbcc", "java"};

        System.out.println("Character Frequency Counter\n");

        for (String test : testCases) {
            System.out.printf("String: \"%s\"\n", test);

            // HashMap approach
            Map<Character, Integer> freq = countFrequency(test);
            System.out.print("Frequency: ");
            printFrequency(freq);

            // Array approach (lowercase only)
            int[] freqArray = countFrequencyArray(test);
            System.out.print("Array (a-z): ");
            for (int i = 0; i < 26; i++) {
                if (freqArray[i] > 0) {
                    System.out.printf("%c:%d ", (char)('a' + i), freqArray[i]);
                }
            }
            System.out.println("\n");
        }
    }
}

