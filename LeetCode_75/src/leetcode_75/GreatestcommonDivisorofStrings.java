package leetcode_75;

public class GreatestcommonDivisorofStrings {
	public static String gcdOfStrings(String str1, String str2) {
        // Check if concatenated strings are equal or not, if not return ""
        if (!(str1 + str2).equals(str2 + str1))
            return "";
        // If strings are equal than return the substring from 0 to gcd of size(str1), size(str2)
        int gc = gcd(str1.length(), str2.length());
        return str1.substring(0, gc);
    }

  public static	 int gcd(int a, int b) {
        while (b != 0) {
            int temp = a;
            a = b;
            b = temp % b;
        }
        return a;
    }
   public static void main(String[] args) {
	String str1="ABCABC";
	String str2="ABC";
	System.out.println(GreatestcommonDivisorofStrings.gcdOfStrings(str1, str2));
}

}
