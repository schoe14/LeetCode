/**
 * Given an array nums of integers, return how many of them contain an even number of digits.
 */
public class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if ((num / 10 >= 1 && num / 10 <= 9) || (num / 1000 >= 1 && num / 1000 <= 9) ||
                    (num / 100000 >= 1 && num / 100000 <= 9)) {
                count++;
            }
        }
        return count;
    }
}
