/**
 * Given the array of integers nums, you will choose two different indices i and j of that array.
 * Return the maximum value of (nums[i]-1)*(nums[j]-1).
 */
public class Solution {
    public int maxProduct(int[] nums) {
        int m = Integer.MIN_VALUE, n = m;
        for (int num : nums) {
            if (num >= m) {
                n = m;
                m = num;
            } else if (num > n) {
                n = num;
            }
        }
        return (m - 1) * (n - 1);
    }
}
