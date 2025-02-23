package leetcode_75;

public class productExceptSelfSolution {
	public static int[] productExceptSelf(int [] nums) {
		int n=nums.length;
		int ans[]=new int[n];
		int left[]=new int[n];
		left[0]=1;
		for(int i=1;i<n; i++) {
			left[i]=left[i-1]*left[i-1];
		}
		int right = 1;  // Start with 1, because nothing is to the right of the last element
		for (int i = n - 1; i >= 0; i--) {
		    ans[i] = left[i] * right; // Multiply left[i] with the right product
		    right *= nums[i]; // Update right for the next element
		}
		return ans;
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,4};
		int ans[]=productExceptSelf(arr);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}
	}

}
