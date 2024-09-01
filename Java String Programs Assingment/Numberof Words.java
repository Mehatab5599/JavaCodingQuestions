public class WordCounter {

    public static void main(String[] args) {
        String input = "This is a sample sentence to count the number of words.";  // Example input
        int wordCount = countWords(input);
        System.out.println("Number of words: " + wordCount);
    }

    public static int countWords(String str) {
        // Normalize the string by trimming leading and trailing spaces
        str = str.trim();

        // Check if the string is empty
        if (str.isEmpty()) {
            return 0;
        }

        // Split the string into words based on one or more whitespace characters
        String[] words = str.split("\\s+");

        // Return the number of words
        return words.length;
    }
}
