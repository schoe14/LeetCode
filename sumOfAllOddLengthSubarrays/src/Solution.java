/**
 * Given an array of positive integers arr, calculate the sum of all possible odd-length subarrays.
 * A subarray is a contiguous subsequence of the array.
 * Return the sum of all odd-length subarrays of arr.
 */
public class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int res = 0, n = arr.length;
        for (int i = 0; i < n; ++i) {
            res += ((i + 1) * (n - i) + 1) / 2 * arr[i];
        }
        return res;
    }
}
