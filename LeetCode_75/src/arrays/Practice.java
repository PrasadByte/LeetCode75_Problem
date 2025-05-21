package arrays;

public class Practice {
    public static int binarySearch(int arr[], int target) {
        int left = 0;
        int right = arr.length - 1;
       


        while (left <= right) {
        	 int mid =  +(right + left) / 2; // Updating mid inside the loop
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                right = mid - 1; // Only update right
            } else {
                left = mid + 1; // Only update left
            }
        }
        return -1; // If not found
    }

    public static void main(String[] args) {
        int nums[] = {0, 1, 2, 4, 5, 6, 7}; // Sorted array
        int target = 7;
        int result = binarySearch(nums, target);

        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}