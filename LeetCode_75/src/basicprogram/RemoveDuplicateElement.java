package basicprogram;

public class RemoveDuplicateElement {

    // Method to remove duplicates in a sorted array
    public static int removeDuplicate(int[] nums) {
        // Base case: if array has 0 or 1 element, it's already unique
        if (nums.length == 0) return 0;

        int i = 0; // Pointer to place next unique element

        // Traverse the array from the second element
        for (int j = 1; j < nums.length; j++) {
            // If current element is not equal to the last unique element
            if (nums[i] != nums[j]) {
                i++; // Move the pointer for next unique position
                nums[i] = nums[j]; // Replace with the new unique element
            }
        }

        // Return the count of unique elements
        return i + 1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 4, 4, 6, 6, 87, 87}; // Sorted array with duplicates

        int length = removeDuplicate(arr);

        System.out.println("Number of unique elements: " + length);
        System.out.print("Unique elements: ");
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
