package basicprogram;

public class StringPalindrome {
	public static void reverString(String str) {
		int left =0;
		int right = str.length()-1;
		while(left<right) {
			if(str.charAt(right)!= str.charAt(left)) {
				System.out.println(" string is not palindrome");
			}
		}
	}

	public static void main(String[] args) {
		String str = "madam";
		String reverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}
		if (str.equals(reverse)) {
			System.out.println("String is palindrome");
		} else {
			System.out.println("String is not palindrome");
		}
	}
}
