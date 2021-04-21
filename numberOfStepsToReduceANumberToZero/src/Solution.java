/**
 * Given a non-negative integer num, return the number of steps to reduce it to zero.
 * If the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.
 * Constraints:
 * 0 <= num <= 10^6
 */
public class Solution {
    public int numberOfSteps(int num) {
        int result = helper(num, 0);
        return result;
    }
    private int helper(int num, int steps) {
        if (num == 0) {
            return steps;
        }
        if (num % 2 == 0) {
            steps++;
            return helper(num / 2, steps);
        } else {
            steps++;
            return helper(num - 1, steps);
        }
    }
}
