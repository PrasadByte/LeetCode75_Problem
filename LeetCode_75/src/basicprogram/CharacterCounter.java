package basicprogram;

import java.util.HashMap;
import java.util.Map;

public class CharacterCounter {

    public static Map<Character, Integer> countCharacterOccurrences(String str) {
        Map<Character, Integer> charCountMap = new HashMap<>();
        if (str == null) {
            return charCountMap;
        }
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            charCountMap.put(currentChar, charCountMap.getOrDefault(currentChar, 0) + 1);
        }
        return charCountMap;
    }

    public static void main(String[] args) {
        String input = "prasad";
        Map<Character, Integer> occurrences = countCharacterOccurrences(input);
        System.out.println(occurrences); // Output: {h=1, e=1, l=2, o=1}
    }
}


