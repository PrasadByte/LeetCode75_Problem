package basic;

public class ReverseString {
	
	public static void reverser(String str) {
	
		String rev="";
		for(int i = str.length()-1;i>=0;i--) {
			rev += str.charAt(i);
		}
		System.out.println("reveser String is = "+ rev);
	}
	
	public static void reveserWithStringbuilder(String str) {
		StringBuilder rev=new StringBuilder(str);
		System.out.print("the servese String is + "+ rev.reverse());
	}
	
		
	
	
	
	public static void main(String[] args) {
		String  p = "prasad is good boy";
		//reverser(p);
		//reveserWithStringbuilder(p);
		
		int num=10;
		if(num%2==0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
	
		
	}
}
