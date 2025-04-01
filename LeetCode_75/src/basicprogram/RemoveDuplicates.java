package basicprogram;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
     public static String removeDuplicates(String str) {
        if (str == null) {
            return null;
        }
        Set<Character> seen = new HashSet<>();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (!seen.contains(currentChar)) {
                seen.add(currentChar);
                result.append(currentChar);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String input = "banana";
        System.out.println(removeDuplicates(input)); // Output: ban
    }
}
