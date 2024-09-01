import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {

    public static void main(String[] args) {
        String input = "swiss";  // Example input
        char result = findFirstNonRepeatedCharacter(input);
        
        if (result != '\0') {
            System.out.println("The first non-repeated character is: " + result);
        } else {
            System.out.println("All characters are repeated.");
        }
    }

    public static char findFirstNonRepeatedCharacter(String str) {
        // Create a LinkedHashMap to store character frequencies and preserve insertion order
        Map<Character, Integer> charCountMap = new LinkedHashMap<>();

        // Count the frequency of each character
        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Find the first character with a frequency of 1
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        // Return null character if no non-repeated character is found
        return '\0';
    }
}