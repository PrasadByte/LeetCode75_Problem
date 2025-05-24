package arrays;

import java.util.HashMap;
import java.util.Hashtable;

public class Practice {
	public static int [] twoSum(int []num,int target) {
		HashMap<Integer, Integer>map=new HashMap<>();
		for (int i = 0; i < num.length; i++) {
		int	complement = target - num[i];
		if(map.containsKey(complement)) {
			return new int[] {map.get(complement), i};
		}
		map.put(num[i], i);
		}
		return new int [] {};
	}
	public static void main(String[] args) {
		int [] arr = {1,3,4,6,8,9};
		int target =17;
		int [] result =twoSum(arr, target);
		if(result.length==2) {
			 System.out.println("Indices: [" + result[0] + ", " + result[1 ] + "]");
			System.out.println(result[0] +" "+ result[1]);
		}else {
			System.out.println("no sum solution found");
		}
		System.out.println(twoSum(arr, target));
	}
}