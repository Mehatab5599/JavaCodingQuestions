import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        // Call the method to count character occurrences
        Map<Character, Integer> charCountMap = countCharacterOccurrences(input);
        
        // Display the results
        System.out.println("Character counts:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        // Close the scanner
        scanner.close();
    }

    // Method to count occurrences of each character
    public static Map<Character, Integer> countCharacterOccurrences(String str) {
        // Create a HashMap to store character counts
        Map<Character, Integer> charCountMap = new HashMap<>();
        
        // Convert the string to a character array
        for (char ch : str.toCharArray()) {
            // Update the count for each character
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }
        
        return charCountMap;
    }
}
