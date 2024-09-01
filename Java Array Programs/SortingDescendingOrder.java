import java.util.Arrays;
import java.util.Collections;

public class SortArrayDescending {
    public static void main(String[] args) {
        // Initialize the array with some values
        Integer[] numbers = {5, 2, 9, 1, 5, 6};
        
        // Sort the array in descending order
        Arrays.sort(numbers, Collections.reverseOrder());
        
        // Print the sorted array
        System.out.println("Array sorted in descending order: " + Arrays.toString(numbers));
    }
}
