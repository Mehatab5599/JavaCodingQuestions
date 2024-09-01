import java.util.HashMap;
import java.util.Map;

public class DuplicateWordsFinder {

    public static void main(String[] args) {
        String input = "This is a test. This test is only a test.";  // Example input
        findDuplicateWords(input);
    }

    public static void findDuplicateWords(String str) {
        // Remove punctuation and convert to lowercase for uniformity
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

        // Find and print duplicate words
        boolean hasDuplicates = false;
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Word '" + entry.getKey() + "' is duplicated " + entry.getValue() + " times.");
                hasDuplicates = true;
            }
        }

        if (!hasDuplicates) {
            System.out.println("No duplicate words found.");
        }
    }
}
