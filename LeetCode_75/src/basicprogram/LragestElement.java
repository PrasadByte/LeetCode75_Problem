package basicprogram;

public class LragestElement {
    public static int largestElement(int []nums){
        int largest = nums [0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>largest){
                largest = nums[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int []arr= {65,5,56,7,75,4,87,755};
        System.out.println(largestElement(arr));
    }
}
