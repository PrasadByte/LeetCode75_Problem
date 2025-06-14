package arrays;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class Practice {
	public static Map<Character, Integer> countCharacter(String str) {
		Map<Character, Integer> countChar = new Hashtable<Character, Integer>();
		if (str == null)
			return countChar;
		for (int i = 0; i < str.length(); i++) {
			char currentChar = str.charAt(i);
			countChar.put(currentChar, countChar.getOrDefault(currentChar, 0) + 1);
		}
		return countChar;
	}
	public static void main(String[] args) {
		String input = "prasad";
		Map<Character,Integer>result = countCharacter(input);
		System.out.println(result);
	}

}
