package basicprogram;

public class Practical {
	
	public static boolean issorted(int [] num) {
		for(int i=1;i<num.length;i++) {
			if(num[i]>num[i-1]);
		else {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6,7,8,9};
		System.out.println(issorted(arr));
	}

}
