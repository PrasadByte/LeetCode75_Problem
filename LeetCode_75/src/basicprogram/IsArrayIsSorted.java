package basicprogram;

public class IsArrayIsSorted {
	public static boolean isArraySorted(int []nums) {
		for (int i = 1; i < nums.length; i++) {
			if(nums[i]>=nums[i-1]) {
				
			}
			else {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		int [] arr= {1,2,90,4,5,6,7,8,9};
		System.out.println(isArraySorted(arr));
	}
}
