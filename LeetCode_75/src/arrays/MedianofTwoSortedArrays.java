package arrays;

import java.util.Arrays;

public class MedianofTwoSortedArrays {
	public static double  findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Get the sizes of both input arrays.
        int n = nums1.length;
        int m = nums2.length;

        // Merge the arrays into a single sorted array.
        int[] merged = new int[n + m];
        int k = 0;
        for (int i = 0; i < n; i++) {
            merged[k++] = nums1[i];
        }
        for (int i = 0; i < m; i++) {
            merged[k++] = nums2[i];
        }

        // Sort the merged array.
        Arrays.sort(merged);

        // Calculate the total number of elements in the merged array.
        int total = merged.length;

        if (total % 2 == 1) {
            // If the total number of elements is odd, return the middle element as the median.
            return (double) merged[total / 2];
        } else {
            // If the total number of elements is even, calculate the average of the two middle elements as the median.
            int middle1 = merged[total / 2 - 1];
            int middle2 = merged[total / 2];
            return ((double) middle1 + (double) middle2) / 2.0;
        }
    }

    // Main method for testing
    public static void main(String[] args) {
      
        
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        System.out.println("Median: " + findMedianSortedArrays(nums1, nums2));  // Output: 2.0

        int[] nums3 = {1, 2};
        int[] nums4 = {3, 4};
        System.out.println("Median: " + findMedianSortedArrays(nums3, nums4));  // Output: 2.5
    }
}
