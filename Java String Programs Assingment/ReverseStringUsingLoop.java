public class ReverseString {

    public static void main(String[] args) {
        String input = "hello";
        String reversed = reverseUsingLoop(input);
        System.out.println("Reversed String (Loop): " + reversed);
    }

    private static String reverseUsingLoop(String input) {
        char[] chars = input.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        
        while (left < right) {
            // Swap characters
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            
            left++;
            right--;
        }
        
        return new String(chars);
    }
}
