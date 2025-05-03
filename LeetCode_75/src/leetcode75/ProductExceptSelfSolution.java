package leetcode75;

public class ProductExceptSelfSolution {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];  // This array will store the final output
        int left[] = new int[n]; // This array will store the product of elements to the left of each index

        // Initialize the first element of left array to 1, 
        // because there is nothing to the left of the first element.
        left[0] = 1;

        // Fill the left array
        // left[i] should be the product of all elements before index i
        for (int i = 1; i < n; i++) {
            left[i] = left[i - 1] * nums[i - 1];  // Multiply previous left product with nums[i-1]
        }

        int right = 1;  // Start with 1, because nothing is to the right of the last element
        
        // Iterate from right to left and calculate the final answer
        for (int i = n - 1; i >= 0; i--) {
            ans[i] = left[i] * right; // Multiply left[i] (left product) with right (right product)
            right *= nums[i]; // Update right for the next iteration
        }

        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        int ans[] = productExceptSelf(arr);

        // Print the result array
        for (int num : ans) {
            System.out.print(num + " ");
        }
    }
}
