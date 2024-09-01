public class CheckLetters {

    public static void main(String[] args) {
        String input = "HelloWorld";
        boolean result = containsOnlyLetters(input);
        System.out.println("Contains only letters: " + result);
    }

    private static boolean containsOnlyLetters(String input) {
        // Regular expression to match strings that contain only letters
        return input.matches("[a-zA-Z]+");
    }
}
