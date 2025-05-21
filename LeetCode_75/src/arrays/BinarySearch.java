package arrays;

public class BinarySearch {
	 int binarySearch(int arr[], int x)
	    {
	        int left = 0, right = arr.length - 1;
	        while (left <= right) {
	            int mid =  (left + right) / 2;

	            // Check if x is present at mid
	            if (arr[mid] == x)
	                return mid;

	            // If x greater, ignore right half
	            if (arr[mid] > x)
	                right = mid - 1;

	            // If x is smaller, ignore left half
	            else
	             left = mid + 1;
	        }

	        // If we reach here, then element was
	        // not present
	        return -1;
	    }

	    // Driver code
	    public static void main(String args[])
	    {
	        BinarySearch ob = new BinarySearch();
	        int arr[] = { 2, 3, 4, 10, 40,50,70};
	        int n = arr.length;
	        int x = 4;
	        int result = ob.binarySearch(arr, x);
	        if (result == -1)
	            System.out.println(
	                "Element is not present in array");
	        else
	            System.out.println("Element is present at "
	                               + "index " + result);
	    }
	}
