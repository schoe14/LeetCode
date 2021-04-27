import java.util.Map;

/**
 * You are given a string s of even length.
 * Split this string into two halves of equal lengths, and let a be the first half and b be the second half.
 * Two strings are alike if they have the same number of vowels ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U').
 * Notice that s contains uppercase and lowercase letters.
 * Return true if a and b are alike. Otherwise, return false.
 */
public class Solution {
    public boolean halvesAreAlike(String s) {
        // 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'
        int count = 0;
        s = s.toLowerCase();
        Map<Character, Character> map =
                Map.of('a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U');
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                count += (i < s.length() / 2) ? +1 : -1;
            }
        }
        return count == 0;
    }
}
