package leetcode75;

import java.util.Stack;

public class LongestValidParentheses {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1); // Initialize base for length calculation
        int max_len = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    max_len = Math.max(max_len, i - stack.peek());
                }
            }
        }

        return max_len;
    }

    // Main method to test the function
    public static void main(String[] args) {
        LongestValidParentheses solution = new LongestValidParentheses();

        // Example test cases
        String s1 = "(()";
        String s2 = ")()())";
        String s3 = "(()())";
        String s4 = "";

        System.out.println("Input: \"" + s1 + "\" => Longest Valid Parentheses: " + solution.longestValidParentheses(s1));
        System.out.println("Input: \"" + s2 + "\" => Longest Valid Parentheses: " + solution.longestValidParentheses(s2));
        System.out.println("Input: \"" + s3 + "\" => Longest Valid Parentheses: " + solution.longestValidParentheses(s3));
        System.out.println("Input: \"" + s4 + "\" => Longest Valid Parentheses: " + solution.longestValidParentheses(s4));
    }
}
