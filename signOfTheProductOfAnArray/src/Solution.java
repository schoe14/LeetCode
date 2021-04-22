/**
 * There is a function signFunc(x) that returns:
 * 1 if x is positive.
 * -1 if x is negative.
 * 0 if x is equal to 0.
 * You are given an integer array nums. Let product be the product of all values in the array nums.
 * Return signFunc(product).
 */
public class Solution {
    public int arraySign(int[] nums) {
        int result = 1;
        for (int num : nums) {
            if (result * num == 0 || num == 0) {
                return 0;
            }
            result = (result * num < 0) ? -1 : 1;
        }
        return result;
    }
}
