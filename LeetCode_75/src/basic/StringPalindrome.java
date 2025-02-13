package basic;

public class StringPalindrome {
	public static isPalindrome(String s) {
		int i = 0, j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	public static void main(String[] args) {
		String s = "madam";
        System.out.println((isPalindrome(s) ? "Yes" : "No"));))
	}

}
