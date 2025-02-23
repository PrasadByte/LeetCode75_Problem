package leetcode_75;

public class Practice {
 public static String reverseWord(String s) {
	 StringBuilder result=new StringBuilder();
	 String [] word= s.split(" ");
	 for(int i=word.length-1;i>=0;i--) {
		 result.append(word[i]);
		 if(i!=0) {
			 result.append(" ");
		 }
	 }
	 return result.toString();
 }
 public static void main(String[] args) {
	String p = "prasad is good boy";
	System.out.println(reverseWord(p));
}
}
