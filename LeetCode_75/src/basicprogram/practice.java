package basicprogram;

import java.util.Scanner;

public class practice {
	
	public static void palindromeString(String str){
		int right = str.length()-1;
		int left = 0;
		while(left<right){
			if(str.charAt(left) != str.charAt(right)){
				System.out.println(str+" String is not palindrome");
			}
			left++;
			right--;
			
		}
		System.out.println(str+" String is palindrome");
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		//System.out.println(palindromeString(str));
		palindromeString(str);
	}}


