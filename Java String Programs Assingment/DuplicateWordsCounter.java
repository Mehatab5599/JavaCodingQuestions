import java.util.HashMap;
import java.util.Map;

public class DuplicateWordsCounter {

    public static void main(String[] args) {
        String input = "This is a test. This test is only a test.";  // Example input
        countDuplicateWords(input);
    }

    public static void countDuplicateWords(String str) {
        // Normalize the string: remove punctuation and convert to lowercase
        String normalizedStr = str.replaceAll("[^a-zA-Z0-9\\s]", "").toLowerCase();

        // Split the string into words
        String[] words = normalizedStr.split("\\s+");

        // Create a HashMap to store word frequencies
        Map<String, Integer> wordCountMap = new HashMap<>();

        // Count the frequency of each word
        for (String word : words) {
            if (!word.isEmpty()) {
                wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
            }
        }

        // Count the number of duplicate words
        int duplicateCount = 0;
        for (Integer count : wordCountMap.values()) {
            if (count > 1) {
                duplicateCount++;
            }
        }

        // Print the result
        System.out.println("Number of duplicate words: " + duplicateCount);
    }
}
