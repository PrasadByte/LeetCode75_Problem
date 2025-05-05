package leetcod_75;


public class Practice {
    public static boolean  Increasing(int num[]){
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for(int n : num) {
            if(n<=first){
                first = n;
            }
            else if(n<=second){
                second=n;
            }
            else{
                return true;
            }
          
        }
        return false;
    }
    public static void main(String[] args) {
        int [] arr = {2,1,5,0,4,6};
        System.out.println(Increasing(arr));
    }
}

