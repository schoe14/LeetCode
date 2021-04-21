import java.util.HashSet;

/**
 * A pangram is a sentence where every letter of the English alphabet appears at least once.
 * Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.
 * Constraints:
 * 1 <= sentence.length <= 1000
 * sentence consists of lowercase English letters.
 */
public class Solution {
    public boolean checkIfPangram(String sentence) {
        if (sentence.length() < 26) {
            return false;
        }
        HashSet<Character> charList = new HashSet<>();
        for (char c = 'a'; c <= 'z'; c++) {
            charList.add(c);
        }
        for (int i = 0; i < sentence.length(); i++) {
            if (charList.contains(sentence.charAt(i))) {
                charList.remove(sentence.charAt(i));
            }
        }
        if (charList.size() == 0) {
            return true;
        }
        return false;
    }
}
