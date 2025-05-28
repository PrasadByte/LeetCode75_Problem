package arrays;

//import java.util.Scanner;
import java.util.Scanner;


public class ArrayInput {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Size of the array");
	int size=sc.nextInt();
	int []arr=new int[size];
	System.out.println("Enter the elements of the array");
	for (int i = 0; i < arr.length; i++) {
		//take input from user
		arr[i]=sc.nextInt();
		
	}
	System.out.println("The elements of the array are:");
	for (int i = 0; i < arr.length; i++) {
		//print the elements of the array
		System.out.print(arr[i]+" ");
	}
	}

}
