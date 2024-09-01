import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class RemoveDuplicateWords {

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        scanner.close();

        // Call the method to remove duplicate words and print the result
        String result = removeDuplicateWords(input);
        System.out.println("String after removing duplicates: " + result);
    }

    // Method to remove duplicate words from a string
    private static String removeDuplicateWords(String input) {
        // Split the input string into words using whitespace as the delimiter
        String[] words = input.split("\\s+");

        // Use a Set to keep track of unique words
        Set<String> wordSet = new HashSet<>();

        // Use a StringBuilder to build the result string
        StringBuilder result = new StringBuilder();

        // Iterate over the words
        for (String word : words) {
            // Add the word to the Set (duplicate words will not be added)
            if (wordSet.add(word)) {
                // Append the word to the result StringBuilder if it's unique
                result.append(word).append(" ");
            }
        }

        // Convert the StringBuilder to a String and trim any trailing whitespace
        return result.toString().trim();
    }
}
