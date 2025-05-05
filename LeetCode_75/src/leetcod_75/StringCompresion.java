package leetcod_75;
public class StringCompresion {
    public static int compress(char[] chars) {
        int index = 0;  // write index
        int i = 0;      // read index

        while (i < chars.length) {
            char currentChar = chars[i];
            int count = 0;

            // Count how many times currentChar repeats
            while (i < chars.length && chars[i] == currentChar) {
                i++;
                count++;
            }

            // Write the character
            chars[index++] = currentChar;

            // If count > 1, write the digits of the count
            if (count > 1) {
                for (char c : String.valueOf(count).toCharArray()) {
                    chars[index++] = c;
                }
            }
        }

        return index;
     }

//     Input: chars = ["a","a","b","b","c","c","c"]
// Output: Return 6, and the first 6 characters of the input array should be: ["a","2","b","2","c","3"]
// Explanation: The groups are "aa", "bb", and "ccc". This compresses to "a2b2c3".
     public static void main(String[] args) {
        char[] chars = {'a','a','b','b','c','c','c'};
        System.out.println(compress(chars));
     }
}


