package basicprogram;

public class SecondLargestAndSmallest {

    // Method to find the second largest element in the array
    public static int secondLargest(int[] arr) {
        int largest = arr[0];  // Initialize the largest with the first element
        int slargest = -1;     // Initialize second largest with -1 (assuming all elements are non-negative)

        // Traverse the array from the second element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                // If current element is greater than largest,
                // update second largest to current largest
                slargest = largest;
                largest = arr[i];  // Update largest to current element
            } else if (arr[i] < largest && arr[i] > slargest) {
                // If current element is not equal to largest
                // and greater than second largest, update second largest
                slargest = arr[i];
            }
        }

        return slargest;
    }

    // Method to find the second smallest element in the array
    public static int secondSmallest(int[] arr) {
        int smallest = arr[0];               // Initialize the smallest with the first element
        int ssmallest = Integer.MAX_VALUE;   // Initialize second smallest to max integer value

        // Traverse the array from the second element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                // If current element is less than smallest,
                // update second smallest to current smallest
                ssmallest = smallest;
                smallest = arr[i];  // Update smallest to current element
            } else if (arr[i] != smallest && arr[i] < ssmallest) {
                // If current element is not equal to smallest
                // and less than second smallest, update second smallest
                ssmallest = arr[i];
            }
        }

        return ssmallest;
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 9, 3};  // Sample input array

        // Print the results
        System.out.println("Second Largest: " + secondLargest(arr));
        System.out.println("Second Smallest: " + secondSmallest(arr));
    }
}
