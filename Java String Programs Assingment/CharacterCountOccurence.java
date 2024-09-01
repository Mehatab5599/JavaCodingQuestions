import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterCount {

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        scanner.close();

        // Call the method to count characters and print the results
        countCharacterOccurrences(input);
    }

    // Method to count occurrences of each character
    private static void countCharacterOccurrences(String input) {
        // Create a HashMap to store character counts
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Convert the input string to a character array
        char[] characters = input.toCharArray();

        // Iterate over each character in the array
        for (char c : characters) {
            // Check if the character is already in the map
            if (charCountMap.containsKey(c)) {
                // If it is, increment its count
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                // If it isn't, add it to the map with a count of 1
                charCountMap.put(c, 1);
            }
        }

        // Print the occurrences of each character
        System.out.println("Character counts:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
