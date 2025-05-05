package leetcode75;

public class IncreasingTripleSubSqence {
    public  static  boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for (int n : nums) {
            if (n <= first) {
                first = n;
            } else if (n <= second) {
                second = n;
            } else {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int [] arr= {2,1,5,0,4,6};
        System.out.println(increasingTriplet(arr)); // true
    }
}
