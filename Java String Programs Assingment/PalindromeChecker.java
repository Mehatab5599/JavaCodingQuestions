public class PalindromeChecker {

    public static void main(String[] args) {
        String input = "A man, a plan, a canal, Panama";  // Example input
        boolean result = isPalindrome(input);
        
        if (result) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String str) {
        // Normalize the string: remove non-alphanumeric characters and convert to lowercase
        String normalizedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Initialize pointers
        int left = 0;
        int right = normalizedStr.length() - 1;

        // Check for palindrome
        while (left < right) {
            if (normalizedStr.charAt(left) != normalizedStr.charAt(right)) {
                return false;  // Not a palindrome
            }
            left++;
            right--;
        }

        return true;  // Is a palindrome
    }
}