package arrays;

import java.util.Scanner;

public abstract class Practice {
	public static int binarySerach(int[] arr, int target) {
		int left = 0;
		int right = arr.length - 1;
		while (left < right) {
			int mid = left + (right - left) / 2;
			if (arr[mid] == target) {
				return mid;
			} else if (arr[mid] > target) {
				right = mid - 1;

			} else {
				left = mid + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the size of the array");
	 int size = sc.nextInt();
	 int [] arr= new int [size];
	
	 System.out.println("Enter the element to find");
	 int target= sc.nextInt();
	System.out.println(binarySerach(arr, target));	 
  }
}