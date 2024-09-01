public class SubstringOccurrences {

    public static void main(String[] args) {
        String input = "This is a test. This test is only a test.";
        String substring = "test";  // Substring to find
        int count = countOccurrences(input, substring);
        System.out.println("Number of occurrences of \"" + substring + "\": " + count);
    }

    public static int countOccurrences(String str, String substr) {
        if (str == null || substr == null || substr.isEmpty()) {
            return 0; // Return 0 if the input string or substring is null or empty
        }

        int count = 0;
        int index = 0;

        // Loop to find all occurrences of the substring
        while ((index = str.indexOf(substr, index)) != -1) {
            count++;
            index += substr.length(); // Move index to the end of the current match
        }

        return count;
    }
}
