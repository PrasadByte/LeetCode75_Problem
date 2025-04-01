
	

package basic;

import java.util.Scanner;

public class fibonaciSeries {

    public static void fibonaciee(int num) {
        int num1 = 1;
        int num2 = 2;
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            System.out.println(num1);
            sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms: ");
        int num = sc.nextInt();
        fibonaciee(num);
        sc.close();
    }
}
