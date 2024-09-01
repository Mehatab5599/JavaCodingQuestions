import java.util.HashMap;
import java.util.Map;

public class MaxOccurringCharacter {
    public static void main(String[] args) {
        // Sample input string
        String inputString = "programming";

        // Find the maximum occurring character
        char maxChar = findMaxOccurringCharacter(inputString);

        // Output the result
        System.out.println("The maximum occurring character is: " + maxChar);
    }

    /**
     * Finds the maximum occurring character in a string.
     *
     * @param str the input string
     * @return the maximum occurring character
     */
    public static char findMaxOccurringCharacter(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Input string cannot be null or empty");
        }

        // Create a map to store character counts
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Populate the map with character counts
        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Find the character with the maximum count
        char maxChar = '\0'; // Initialize to null character
        int maxCount = 0;

        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxChar = entry.getKey();
            }
        }

        return maxChar;
    }
}
