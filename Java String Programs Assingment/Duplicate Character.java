import java.util.HashMap;
import java.util.Map;

public class DuplicateCharactersFinder {

    public static void main(String[] args) {
        String input = "programming";  // Example input
        findDuplicateCharacters(input);
    }

    public static void findDuplicateCharacters(String str) {
        // Create a HashMap to store character frequencies
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Count the frequency of each character
        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Find and print duplicate characters
        boolean hasDuplicates = false;
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Character '" + entry.getKey() + "' is duplicated " + entry.getValue() + " times.");
                hasDuplicates = true;
            }
        }

        if (!hasDuplicates) {
            System.out.println("No duplicate characters found.");
        }
    }
}
