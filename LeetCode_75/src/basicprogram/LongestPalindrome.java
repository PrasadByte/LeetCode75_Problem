package basicprogram;

public class LongestPalindrome {
    public static void main(String[] args) {
        String input = "babad"; // Example input
        String longestPalindrome = findLongestPalindromicSubstring(input);
        System.out.println("Longest Palindromic Substring: " + longestPalindrome);
    }

    // Method to find the longest palindromic substring
    public static String findLongestPalindromicSubstring(String s) {
        if (s == null || s.length() < 1) return "";

        int start = 0, end = 0;
        
        for (int i = 0; i < s.length(); i++) {
            // Expand around a single center (odd length palindromes)
            int len1 = expandAroundCenter(s, i, i);
            // Expand around two centers (even length palindromes)
            int len2 = expandAroundCenter(s, i, i + 1);
            
            // Take the maximum length found
            int len = Math.max(len1, len2);
            
            // Update the start and end indices of the longest palindrome
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        
        return s.substring(start, end + 1);
    }

    // Helper method to expand around the center and find palindrome length
    private static int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1; // Return length of palindrome found
    }
}
