
	

package basicprogram;

import java.util.Scanner;

public class fibonaciSeries {

    public static void fibonaciee(int num) {
        int first = 1;
        int second = 2;
      int sum = 0;
        for (int i = 1; i <= num; i++) {
            System.out.println(first);
            sum = first + second;
            first = second;
            second = sum;
        }
        
    }
    public static int fibonacci(int num){
        if(num <=1){
            return num;
        }
        return fibonacci(num-1)+fibonacci(num-2);
    }//the code modifeid 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms: ");
        int num = sc.nextInt();
         //fibonaciee(num);
        // sc.close();
        for (int i = 0; i < num; i++) {
            System.out.println(fibonacci(i));
        }
    }
    
}
