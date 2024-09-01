import java.util.Scanner;

public class SwapStrings {

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String str1 = scanner.nextLine();
        System.out.println("Enter the second string:");
        String str2 = scanner.nextLine();
        scanner.close();

        // Display original strings
        System.out.println("Before swapping:");
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        // Swap strings using different methods
        String[] swapped = swapStrings(str1, str2);
        System.out.println("After swapping:");
        System.out.println("String 1: " + swapped[0]);
        System.out.println("String 2: " + swapped[1]);
    }

    // Method 1: Using a Temporary Variable
    private static String[] swapStrings(String str1, String str2) {
        String temp = str1;
        str1 = str2;
        str2 = temp;
        return new String[]{str1, str2};
    }
}
