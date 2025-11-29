package problems.strings.level1;

/**
 * String Compression
 * Compress string using character counts (e.g., aabbbcccc → a2b3c4)
 */
public class StringCompression {

    /**
     * method to compress string with character counts
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     */
    public static String compress(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 0; i < str.length(); i++) {
            if (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                compressed.append(str.charAt(i));
                if (count > 1) {
                    compressed.append(count);
                }
                count = 1;
            }
        }

        // Return original if compressed is not shorter
        return compressed.length() < str.length() ? compressed.toString() : str;
    }

    /**
     * method to compress string - always show count even for single characters
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     */
    public static String compressWithAllCounts(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 0; i < str.length(); i++) {
            if (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                compressed.append(str.charAt(i)).append(count);
                count = 1;
            }
        }

        return compressed.toString();
    }

    public static void main(String[] args) {
        String[] testCases = {
            "aaabbcccc",
            "aabcccccaaa",
            "abcdef",
            "aaaa",
            "aabbcc"
        };

        System.out.println("String Compression\n");

        for (String test : testCases) {
            System.out.printf("Input:              %-20s\n", "\"" + test + "\"");
            System.out.printf("Compressed:         %-20s\n", "\"" + compress(test) + "\"");
            System.out.printf("With All Counts:    %-20s\n", "\"" + compressWithAllCounts(test) + "\"");
            System.out.println();
        }
    }
}
