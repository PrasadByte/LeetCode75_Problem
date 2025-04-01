package basicprogram;

import java.util.Scanner;

public class practice {

    public static String ReverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to reverse: ");
        String str = sc.nextLine();
        String reversedString = ReverseString(str);
        System.out.println("Reversed String: " + reversedString);

    }
}
