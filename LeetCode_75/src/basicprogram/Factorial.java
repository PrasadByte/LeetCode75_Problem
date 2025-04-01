	package basicprogram;
	
	public class Factorial {
		
		public static int factorialNo(int num) {
			int temp=1;
			for(int i=1;i<=num;i++) {
				temp *= i;
			}
			return temp;
		}
		
		public static void main(String[] args) {
			System.out.println(factorialNo(5));
		}
	
	}
