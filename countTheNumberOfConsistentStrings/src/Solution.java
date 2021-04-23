/**
 * You are given a string allowed consisting of distinct characters and an array of strings words.
 * A string is consistent if all characters in the string appear in the string allowed.
 * Return the number of consistent strings in the array words.
 */
public class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int sum = 0;
        for (String word : words) {
            for (int i = 0; i < allowed.length(); i++) {
                if (word.contains(allowed.subSequence(i, i + 1))) {
                    word = word.replace(allowed.substring(i, i + 1), "");
                }
            }
            if (word.equals("")) {
                sum++;
            }
        }
        return sum;
    }
}
