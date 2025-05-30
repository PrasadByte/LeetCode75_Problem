package arrays;

import java.util.HashMap;

public class Practice {
	public static int binarySearch(int [] nums, int target) {
		int left =0;
		int right=nums.length-1;
		while(left<=right) {
			int mid = left +(right- left) /2;
			if(nums[mid] == target ) {
				return mid;
			}
			if(nums[mid]>right) {
				right = mid -1;
			}else {
				left= mid  +1;
			}
				
		}
		return -1;
	}
	public static void main(String[] args) {
		int [] arr= {1,2,3,4,5,6,7};
		int target =3;
		binarySearch(arr, target);
	}
}