public class CalculateAverage {
    public static void main(String[] args) {
        // Initialize the array with some values
        double[] numbers = {10.5, 20.0, 30.75, 40.5, 50.25};
        
        // Calculate the average
        double average = calculateAverage(numbers);
        
        // Print the result
        System.out.println("The average is: " + average);
    }
    
    // Method to calculate the average of an array
    public static double calculateAverage(double[] array) {
        // Check if the array is empty to avoid division by zero
        if (array.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }
        
        // Compute the sum of the array elements
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        
        // Calculate the average
        return sum / array.length;
    }
}
