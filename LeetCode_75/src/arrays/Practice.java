package arrays;

public class Practice {
	public static int binaryserach(int arr [], int target) {
		int left =0;
		int right = arr.length-1;
		int mid  =(left + right ) /2;
		while(left <=right) {
			if(arr[mid]== target) {
				return mid;
			}else if(arr[mid]>target) {
				return right = mid -1;
			}
			else {
				return left = mid +1;
			}
		}
		return -1;
				
	}
	public static void main(String[] args) {
		int nums[] = {4,5,6,7,0,1,2};
		int target = 0;
		int result = binaryserach(nums, target);
		if(result == -1) {
			System.out.println("Element not found");
	}
		else {
			System.out.println("Element found at index: " + result);
		}
	}
	}

