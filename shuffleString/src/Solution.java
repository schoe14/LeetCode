import java.util.Arrays;
/**
 * Given a string s and an integer array indices of the same length.
 * The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.
 * Return the shuffled string.
 * Constraints:
 * s.length == indices.length == n
 * 1 <= n <= 100
 * s contains only lower-case English letters.
 * 0 <= indices[i] < n
 * All values of indices are unique (i.e. indices is a permutation of the integers from 0 to n - 1).
 */
public class Solution {
    public String restoreString(String s, int[] indices) {
        char[] results = new char[indices.length];
        for (int i = 0; i < indices.length; i++) {
            results[indices[i]] = s.charAt(i);
        }
        return new String(results);
    }
}
