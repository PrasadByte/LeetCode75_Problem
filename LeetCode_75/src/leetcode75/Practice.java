package leetcode75;

public class Practice {
	public static int[] productExceptItselft(int[] num) {
		int n = num.length;
		int[] ans = new int[n];
		int left[] = new int[n];
		left[0] = 1;
		for (int i = 1; i < n; i++) {
			left[i] = left[i - 1] * num[i - 1];
		}
		int right = 1;
		for (int i = n - 1; i >= 0; i--) {
			ans[i] = left[i] * right;
			right *= num[i];
		}
		return ans;
	}
	public static void main(String[] args) {
		int[] num = { 1, 2, 3, 4 };
		int[] ans = productExceptItselft(num);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}
	}
}
