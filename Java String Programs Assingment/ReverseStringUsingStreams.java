import java.util.stream.Collectors;

public class ReverseString {

    public static void main(String[] args) {
        String input = "hello";
        String reversed = reverseUsingStreams(input);
        System.out.println("Reversed String (Streams): " + reversed);
    }

    private static String reverseUsingStreams(String input) {
        return new StringBuilder(input)
            .reverse()
            .toString(); // Using StringBuilder is still the simplest way with Streams
    }
}
