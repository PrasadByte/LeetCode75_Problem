package leetcode75;

import java.util.Stack;

public class LongestValidParentheses {

    // Function to compute the longest valid parentheses substring
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1); // Base value to help calculate valid lengths
        int max_len = 0; // To track the maximum length of valid parentheses

        // Traverse the string character by character
        for (int i = 0; i < s.length(); i++) {
            // If we find an opening bracket, push its index to stack
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                // Pop the last open bracket index
                stack.pop();

                // If stack becomes empty, push current index as base
                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    // Calculate the length of the current valid substring
                    max_len = Math.max(max_len, i - stack.peek());
                }
            }
        }

        return max_len; // Return the maximum length found
    }

    // Main method to run test cases
    public static void main(String[] args) {
        LongestValidParentheses solution = new LongestValidParentheses();

        // Sample test cases
        String s1 = "(()";
        String s2 = ")()())";
        String s3 = "(()())";
        String s4 = "";
        String s5 = "((())())())";

        System.out.println("Input: \"" + s1 + "\" => Longest Valid Parentheses: " + solution.longestValidParentheses(s1));
        System.out.println("Input: \"" + s2 + "\" => Longest Valid Parentheses: " + solution.longestValidParentheses(s2));
        System.out.println("Input: \"" + s3 + "\" => Longest Valid Parentheses: " + solution.longestValidParentheses(s3));
        System.out.println("Input: \"" + s4 + "\" => Longest Valid Parentheses: " + solution.longestValidParentheses(s4));
        System.out.println("Input: \"" + s5 + "\" => Longest Valid Parentheses: " + solution.longestValidParentheses(s5));
    }
}
