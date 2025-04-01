package basic;

import java.util.Scanner;

public class practice {
	
	public static int fibonaciee(int num) {
	    int num1 = 1;
	    int num2 = 2;
	    int sum = 0;

	    for (int i = 1; i <= num; i++) {
	        if (i == num) { // Return the nth Fibonacci number
	            return num1;
	        }
	        sum = num1 + num2;
	        num1 = num2;
	        num2 = sum;
	    }
	    return -1; // Return -1 if the input `num` is invalid (e.g., `num <= 0`)
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		fibonaciee(num);
		sc.close();
	}

}
