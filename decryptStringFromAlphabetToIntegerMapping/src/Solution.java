/**
 * Given a string s formed by digits ('0' - '9') and '#'.
 * We want to map s to English lowercase characters as follows:
 * Characters ('a' to 'i') are represented by ('1' to '9') respectively.
 * Characters ('j' to 'z') are represented by ('10#' to '26#') respectively.
 * Return the string formed after mapping.
 * It's guaranteed that a unique mapping will always exist.
 */
public class Solution {
    public String freqAlphabets(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            if (i + 3 <= s.length() && s.substring(i, i + 3).contains("#")) {
                result += (char) (Integer.parseInt(s.substring(i, i + 2)) + 'a' - 1);
                i += 2;
            } else {
                result += (char) (Integer.parseInt("" + s.charAt(i)) + 'a' - 1);
            }
        }
        return result;
    }
}
