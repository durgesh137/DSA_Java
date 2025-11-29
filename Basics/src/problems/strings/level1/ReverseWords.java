package problems.strings.level1;

/**
 * Reverse Words in a Sentence
 * Reverse the order of words while keeping individual words intact.
 */
public class ReverseWords {

    /**
     * method to reverse words using split and reverse iteration
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     */
    public static String reverseBySplit(String sentence) {
        if (sentence == null || sentence.trim().isEmpty()) {
            return sentence;
        }

        String[] words = sentence.trim().split("\\s+");
        StringBuilder reversed = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i > 0) {
                reversed.append(" ");
            }
        }

        return reversed.toString();
    }

    /**
     * method to reverse words using manual parsing
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     */
    public static String reverseManually(String sentence) {
        if (sentence == null || sentence.trim().isEmpty()) {
            return sentence;
        }

        sentence = sentence.trim();
        StringBuilder word = new StringBuilder();
        StringBuilder result = new StringBuilder();

        for (int i = sentence.length() - 1; i >= 0; i--) {
            char c = sentence.charAt(i);
            if (c != ' ') {
                word.insert(0, c);
            } else if (word.length() > 0) {
                if (result.length() > 0) {
                    result.append(" ");
                }
                result.append(word);
                word.setLength(0);
            }
        }

        if (word.length() > 0) {
            if (result.length() > 0) {
                result.append(" ");
            }
            result.append(word);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String[] testCases = {
            "Hello World Java",
            "  Multiple   Spaces  ",
            "SingleWord",
            "The quick brown fox",
            "A B C"
        };

        System.out.println("Reverse Words in a Sentence\n");

        for (String test : testCases) {
            System.out.printf("Input:     %-30s\n", "\"" + test + "\"");
            System.out.printf("Output:    %-30s (Split)\n", "\"" + reverseBySplit(test) + "\"");
            System.out.printf("           %-30s (Manual)\n", "\"" + reverseManually(test) + "\"");
            System.out.println();
        }
    }
}
