public class RemoveWhitespaces {
    public static void main(String[] args) {
        // Sample input string with whitespaces
        String inputString = "  This is an example string with   whitespaces.  ";

        // Remove all whitespaces using replaceAll with a regex
        String resultString = inputString.replaceAll("\\s+", "");

        // Output the result
        System.out.println("Original String: '" + inputString + "'");
        System.out.println("String without whitespaces: '" + resultString + "'");
    }
}
