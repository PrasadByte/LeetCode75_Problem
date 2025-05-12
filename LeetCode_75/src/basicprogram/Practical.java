package basicprogram;

public class Practical {
    public static int digitcount(int num) {
        int count = 0;
        
        // Loop runs as long as num is greater than 0
        for (; num > 0; num /= 10) {
            count++;  // Increment count for each digit
        }
        
        return count;
    }

    public static void main(String[] args) {
        int digit = 657732;
        System.out.println("Number of digits: " + digitcount(digit));
    }
}
