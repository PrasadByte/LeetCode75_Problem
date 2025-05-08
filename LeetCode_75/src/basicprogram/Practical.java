package basicprogram;

import java.util.Scanner;

public class Practical {
	public static int secondLargest(int[] nums) {
		int largest = nums[0];
		int slargest = -1;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > largest) {
				slargest = largest;
				largest = nums[i];
			} else if (nums[i] < largest && nums[i] > slargest) {
				slargest = nums[i];
			}

		}

		return slargest;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		int []arr=new int[size];
		System.out.println("Enter the element for the array");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		int result = secondLargest(arr);
		if(result <0 ) {
			System.err.println("negative element cant be entre");
		}else {
			System.err.println("second largest element is "+ secondLargest(arr));
		}
	}
}
