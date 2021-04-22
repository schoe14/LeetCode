import java.util.*;
/**
 * Given the array candies and the integer extraCandies, where candies[i] represents the number of candies that the ith kid has.
 * For each kid check if there is a way to distribute extraCandies among the kids
 * such that he or she can have the greatest number of candies among them.
 * Notice that multiple kids can have the greatest number of candies.
 * Constraints:
 * 2 <= candies.length <= 100
 * 1 <= candies[i] <= 100
 * 1 <= extraCandies <= 50
 */
public class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        List<Boolean> result = new ArrayList<>();
        for (int candy : candies) {
            max = Math.max(candy, max);
        }
        for (int candy : candies) {
            result.add(candy + extraCandies >= max);
        }
        return result;
    }
}
