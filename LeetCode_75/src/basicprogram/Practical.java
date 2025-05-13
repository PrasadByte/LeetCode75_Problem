package basicprogram;

public class Practical {
	public static int countDigit(int num) {
		int count = 0;
		while(num> 0) {
			num /=10;
			count++;
			
		}
		return count;
		
	}
	public static void main(String[] args) {
		
	}
}
