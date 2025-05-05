package leetcode75;

import java.util.HashSet;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;


public class Practice {
public static int longessubstring(String s){
    int left =0;
    int maxLength =0;
    HashSet<Character> charSet = new HashSet<>();
    for(int right=0;right<s.length();right++){
        if(charSet.contains(s.charAt(right))){
            charSet.remove(s.charAt(left));
            left++;
        }
        charSet.add(s.charAt(right));
        maxLength = Math.max(maxLength, right - left +1);
    }
    return maxLength;
}
	public static void main(String[] args) {
        String s="pras";
        System.out.println(Practice.longessubstring(s));
    }
}

