package arrays;


public class Practice {
	public static int binarySearch(int num [],int target) {
		int left =0;
		int right = num.length-1;
		while(left<right) {
			int mid =left +(right -left);
			if(num[mid]== target) {
				return mid;
			}
			if(num[mid]>= right) {
				mid = right -1;
			}else {
				mid = left +1;
						
			}
		}
		return -1;
	}
	public static void main(String arh[]) {
		int []arr = {1,2,3,4,5,6,7,8,9};
		int target =4;
		int result = binarySearch(arr, target);
		if(result == -1) {
			System.out.println("Index found at index "+ result);
		}else {
			System.out.println("Index Not found");
		}
	}

}

	