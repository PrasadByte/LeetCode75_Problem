package arrays;

import java.util.HashMap;

public class Practice {
	public static int[] twosum(int nums[], int target) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (map.containsKey(complement)) {
				return new int[] { map.get(complement), i };
			}
			map.put(nums[i], i);

		}
		return new int[] { -1, -1 }; // Return an invalid pair if no solution is found
	}
	public static void main(String[] args) {
	int arr [] = { 2, 7, 11, 15 };
	int target = 9;
	int result[] = twosum(arr, target);
	System.out.println("Indices: " + result[0] + ", " + result[1]);
	// Output: Indices: 0, 1
	}

}