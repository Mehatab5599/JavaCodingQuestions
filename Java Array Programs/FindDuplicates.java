import java.util.HashSet;

public class FindDuplicates {
    public static void main(String[] args) {
        // Example array
        int[] array = {1, 2, 3, 4, 2, 5, 3, 6};

        // Find and print duplicate elements
        System.out.println("Duplicate elements:");
        findDuplicates(array);
    }

    public static void findDuplicates(int[] array) {
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int num : array) {
            // If the number is already in the 'seen' set, it's a duplicate
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }

        // Print duplicates
        for (int duplicate : duplicates) {
            System.out.println(duplicate);
        }
    }
}
