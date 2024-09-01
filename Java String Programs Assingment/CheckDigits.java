public class CheckDigits {

    public static void main(String[] args) {
        String input = "123456";
        boolean result = containsOnlyDigits(input);
        System.out.println("Contains only digits: " + result);
    }

    private static boolean containsOnlyDigits(String input) {
        // Regular expression to match strings that contain only digits
        return input.matches("\\d+");
    }
}
