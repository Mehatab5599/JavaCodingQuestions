public class ReverseString {

    public static void main(String[] args) {
        String input = "hello";
        String reversed = reverseUsingStringBuilder(input);
        System.out.println("Reversed String (StringBuilder): " + reversed);
    }

    private static String reverseUsingStringBuilder(String input) {
        return new StringBuilder(input).reverse().toString();
    }
}
