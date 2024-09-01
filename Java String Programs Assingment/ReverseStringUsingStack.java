import java.util.Stack;

public class ReverseString {

    public static void main(String[] args) {
        String input = "hello";
        String reversed = reverseUsingStack(input);
        System.out.println("Reversed String (Stack): " + reversed);
    }

    private static String reverseUsingStack(String input) {
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return reversed.toString();
    }
}
