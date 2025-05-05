package leetcod_75;

public class ReversWord {
	public static String reverseWords(String s) {
		String[] words = s.split(" ");
		StringBuilder sb = new StringBuilder();
		for (int i = words.length - 1; i >= 0; i--) {
			
				sb.append(words[i]);
				if (i != 0) {
					sb.append(" ");
				}
				//this is comment
			
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		String s = "the sky is blue";
		System.out.println(reverseWords(s));
	}
}
