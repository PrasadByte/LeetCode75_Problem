package basic;

public class StringReverse {
	
	public static String reverse(String str) {
              String reverse = "";
        for(int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
	}
	
	public static String StringReverse(String str) {
		char[] charArray = str.toCharArray();
		int start = 0;
		int end = str.length() - 1;
		char temp;
		while (end > start) {
			temp = charArray[start];
			charArray[start] = charArray[end];
			charArray[end] = temp;
			end--;
			start++;
		}
		return new String(charArray);
	}

	public static void main(String[] args) {
		
		//StringReverseString str = "Hello World";
		//System.out.println(reverse(str));
		// Output: dlroW olleH
		//System.out.println(StringReverse(str));
		//StringReverse(str);
	}

}
