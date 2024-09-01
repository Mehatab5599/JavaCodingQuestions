public class ReverseString {

    public static void main(String[] args) {
        String input = "hello";
        String reversed = reverseUsingRecursion(input);
        System.out.println("Reversed String (Recursion): " + reversed);
    }

    private static String reverseUsingRecursion(String input) {
        if (input.isEmpty()) {
            return input;
        }
        // Recursive call with substring and concatenation
        return reverseUsingRecursion(input.substring(1)) + input.charAt(0);
    }
}
