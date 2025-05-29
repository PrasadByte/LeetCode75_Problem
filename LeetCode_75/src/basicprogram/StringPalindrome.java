package basicprogram;

public class StringPalindrome {
	public static void reverString(String str) {
		int left =0;
		int right = str.length()-1;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(right)!= str.charAt(left)) {
				System.out.println(" string is not palindrome");
			}
			else {
				System.out.println("String is palindrome");
			}
		}
	}

	public static void main(String[] args) {
		String str = "madaarem";
//		String reverse = "";
//		for (int i = str.length() - 1; i >= 0; i--) {
//			reverse = reverse + str.charAt(i);
//		}
//		if (str.equals(reverse)) {
//			System.out.println("String is palindrome");
//		} else {
//			System.out.println("String is not palindrome");
//		}
		reverString(str);
	}
}
