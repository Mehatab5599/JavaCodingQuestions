public class ReverseEachWord {

    public static void main(String[] args) {
        String input = "hello world from java";
        String result = reverseEachWord(input);
        System.out.println("String with Each Word Reversed: " + result);
    }

    private static String reverseEachWord(String input) {
        // Split the input string into words
        String[] words = input.split("\\s+");
        
        // Use a StringBuilder to build the result
        StringBuilder result = new StringBuilder();

        // Iterate over each word
        for (String word : words) {
            // Reverse the current word
            String reversedWord = new StringBuilder(word).reverse().toString();
            // Append the reversed word and a space
            result.append(reversedWord).append(" ");
        }

        // Convert the StringBuilder to a String and trim trailing whitespace
        return result.toString().trim();
    }
}
