package problems.strings;

/**
 * Count Vowels and Consonants in a String
 * Time: O(n), Space: O(1)
 */
public class VowelConsonantCount {

    /**
     * Result class to hold the count of vowels and consonants.
     */
    public static class Result {
        // vowels count within string
        int vowels;
       // consonants count within string
        int consonants;

        /**
         * Constructs a Result object with specified vowel and consonant counts.
         *
         * @param vowels the count of vowels
         * @param consonants the count of consonants
         */
        Result(int vowels, int consonants) {
            this.vowels = vowels;
            this.consonants = consonants;
        }
    }

    /**
     * method to check if a character is a vowel
     * @param c
     * @return
     */
    private static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    /**
     * method to count vowels and consonants in the string
     * @param str
     * @return
     */
    public static Result count(String str) {
        int vowels = 0, consonants = 0;

        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                if (isVowel(c)) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        return new Result(vowels, consonants);
    }

    public static void main(String[] args) {
        String[] testCases = {
            "Hello World", "Java Programming", "aeiou", "bcdfg",
            "The quick brown fox", "12345 abc"
        };

        System.out.println("Vowels and Consonants Counter\n");
        System.out.println("String                    | Vowels | Consonants");
        System.out.println("--------------------------|--------|------------");

        for (String test : testCases) {
            Result result = count(test);
            System.out.printf("%-25s | %-6d | %-6d\n",
                "\"" + test + "\"", result.vowels, result.consonants);
        }
    }
}

