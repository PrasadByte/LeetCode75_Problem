package basicprogram;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
    public static Character firstNonRepeatingChar(String str) {
        Map<Character, Integer> frequency = new HashMap<>();

        // Count the frequency of each character
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            frequency.put(c, frequency.getOrDefault(c, 0) + 1);
        }

        // Find the first character with frequency 1
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (frequency.get(c) == 1) {
                return c;
            }
        }

        // If no non-repeating character found
        return null;
    }

    public static void main(String[] args) {
        String input = "hello";
        Character result = firstNonRepeatingChar(input);
        System.out.println("First non-repeating character: " + result);
    }
}