public class CheckString {
    public static void main(String[] args) {
        // Test strings
        String str1 = null;
        String str2 = "";
        String str3 = "Hello, World!";
        
        // Check each string
        System.out.println("str1 is null or empty: " + isNullOrEmpty(str1));
        System.out.println("str2 is null or empty: " + isNullOrEmpty(str2));
        System.out.println("str3 is null or empty: " + isNullOrEmpty(str3));
    }
    
    /**
     * Checks if a string is null or empty.
     *
     * @param str the string to check
     * @return true if the string is null or empty, false otherwise
     */
    public static boolean isNullOrEmpty(String str) {
        return str == null || str.isEmpty();
    }
}
