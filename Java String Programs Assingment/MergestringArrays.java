import java.util.Arrays;

public class MergeStringArrays {

    public static void main(String[] args) {
        // Define two string arrays
        String[] array1 = {"Apple", "Banana", "Cherry"};
        String[] array2 = {"Date", "Elderberry", "Fig"};

        // Merge the arrays
        String[] mergedArray = mergeArrays(array1, array2);

        // Print the merged array
        System.out.println("Merged Array: " + Arrays.toString(mergedArray));
    }

    private static String[] mergeArrays(String[] array1, String[] array2) {
        // Create a new array with the combined length of both arrays
        String[] result = new String[array1.length + array2.length];

        // Copy the first array into the result array
        System.arraycopy(array1, 0, result, 0, array1.length);

        // Copy the second array into the result array
        System.arraycopy(array2, 0, result, array1.length, array2.length);

        return result;
    }
}
