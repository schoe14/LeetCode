import java.util.*;

/**
 * Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it.
 * That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].
 * Return the answer in an array.
 * Constraints:
 * 2 <= nums.length <= 500
 * 0 <= nums[i] <= 100
 */
public class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (mp.containsKey(nums[i])) {
                mp.put(nums[i], mp.get(nums[i]) + 1);
            } else {
                mp.put(nums[i], 1);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (Integer key : mp.keySet()) {
                if (nums[i] > key) {
                    sum += mp.get(key);
                }
            }
            nums[i] = sum;
        }
        return nums;
    }
}
