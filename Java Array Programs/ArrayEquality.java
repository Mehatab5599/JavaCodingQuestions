import java.util.Arrays;

public class ArrayEquality {
    public static void main(String[] args) {
        // Define two arrays
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};
        
        // Check if the arrays are equal
        boolean areEqual = Arrays.equals(array1, array2);
        
        // Print the result
        if (areEqual) {
            System.out.println("The arrays are equal.");
        } else {
            System.out.println("The arrays are not equal.");
        }
    }
}
