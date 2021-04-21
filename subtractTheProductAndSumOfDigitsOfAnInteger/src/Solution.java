/**
 * Given an integer number n, return the difference between the product of its digits and the sum of its digits.
 * Constraints:
 * 1 <= n <= 10^5
 */
public class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int product = 1;
        while (n >= 1) {
            int digit = n % 10;
            sum += digit;
            product *= digit;
            n = n / 10;
        }
        return product - sum;
    }
}
