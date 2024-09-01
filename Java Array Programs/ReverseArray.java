public class ReverseArrayInPlace {
    public static void main(String[] args) {
        // Example array
        int[] array = {1, 2, 3, 4, 5};
        
        // Printing original array
        System.out.println("Original array:");
        printArray(array);
        
        // Reversing the array
        reverseArray(array);
        
        // Printing reversed array
        System.out.println("Reversed array:");
        printArray(array);
    }

    // Method to reverse the array in place
    public static void reverseArray(int[] array) {
        int left = 0; // Starting index
        int right = array.length - 1; // Ending index
        
        while (left < right) {
            // Swap elements
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            
            // Move pointers towards the center
            left++;
            right--;
        }
    }

    // Method to print the array
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
