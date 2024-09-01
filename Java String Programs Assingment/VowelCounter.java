public class VowelConsonantCounter {

    public static void main(String[] args) {
        String input = "Java Programming";  // Example input
        countVowelsAndConsonants(input);
    }

    public static void countVowelsAndConsonants(String str) {
        // Convert the string to lowercase for uniformity
        String normalizedStr = str.toLowerCase();

        // Initialize counters
        int vowelCount = 0;
        int consonantCount = 0;

        // Define a set of vowels
        String vowels = "aeiou";

        // Iterate through each character in the string
        for (char c : normalizedStr.toCharArray()) {
            if (Character.isLetter(c)) {  // Check if the character is a letter
                if (vowels.indexOf(c) != -1) {
                    // Character is a vowel
                    vowelCount++;
                } else {
                    // Character is a consonant
                    consonantCount++;
                }
            }
        }

        // Print the counts
        System.out.println("Vowel count: " + vowelCount);
        System.out.println("Consonant count: " + consonantCount);
    }
}
