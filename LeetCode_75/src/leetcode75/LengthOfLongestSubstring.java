package leetcode75;

import java.util.HashSet;
import java.util.Scanner;

public class LengthOfLongestSubstring {

    public static int lengthOfLongestSubstring(String s) {
        int left = 0; // Start of the window
        int maxLength = 0; // To keep track of the maximum length
        HashSet<Character> charSet = new HashSet<>(); // To store unique characters

        // Loop through the string
        for (int right = 0; right < s.length(); right++) {
            // If the character is already in the set, remove from left until it's gone
            while (charSet.contains(s.charAt(right))) {
                charSet.remove(s.charAt(left));
                left++;
            }

            // Add current character to the set
            charSet.add(s.charAt(right));

            // Update maxLength
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength; // Final result
    }

    // Main method to test the function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = sc.nextLine();  // Accept input from user
        
        int result = lengthOfLongestSubstring(input);  // Call the method
        
        System.out.println("Length of longest substring without repeating characters: " + result);

        sc.close();
    }
}
