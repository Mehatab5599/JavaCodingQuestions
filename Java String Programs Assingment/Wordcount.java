import java.util.HashMap;
import java.util.Map;

public class CharacterCount {

    public static void main(String[] args) {
        String input = "Java Programming";  // Example input
        countCharacterOccurrences(input);
    }

    public static void countCharacterOccurrences(String str) {
        // Create a HashMap to store character frequencies
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Iterate through each character in the string
        for (char c : str.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {  // Optionally count only letters and digits
                // Convert character to lowercase to ensure case-insensitive counting
                c = Character.toLowerCase(c);
                // Update the character count in the HashMap
                charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
            }
        }

        // Print the character frequencies
        System.out.println("Character occurrences:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println("'" + entry.getKey() + "' : " + entry.getValue());
        }
    }
}
