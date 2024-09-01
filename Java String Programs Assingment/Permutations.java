import java.util.HashSet;
import java.util.Set;

public class PermutationsFinder {

    public static void main(String[] args) {
        String input = "abc";  // Example input
        Set<String> permutations = new HashSet<>();
        generatePermutations(input.toCharArray(), 0, permutations);
        
        // Print all permutations
        System.out.println("All permutations:");
        for (String perm : permutations) {
            System.out.println(perm);
        }
    }

    private static void generatePermutations(char[] chars, int currentIndex, Set<String> permutations) {
        if (currentIndex == chars.length - 1) {
            permutations.add(new String(chars));
        } else {
            for (int i = currentIndex; i < chars.length; i++) {
                // Swap the current index with the loop index
                swap(chars, currentIndex, i);
                // Recurse on the remaining substring
                generatePermutations(chars, currentIndex + 1, permutations);
                // Backtrack to the previous state
                swap(chars, currentIndex, i);
            }
        }
    }

    private static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
}
