public class LargestNumberInArray {
    public static void main(String[] args) {
        // Initialize the array
        int[] numbers = {34, 7, 23, 32, 5, 62, 19};
        
        // Assume the first element is the largest initially
        int largest = numbers[0];
        
        // Traverse through the array
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        
        // Print the largest number
        System.out.println("The largest number in the array is: " + largest);
    }
}
