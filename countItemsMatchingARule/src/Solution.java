import java.util.*;

/**
 * You are given an array items, where each items[i] = [typei, colori, namei] describes the type, color, and name of the ith item.
 * You are also given a rule represented by two strings, ruleKey and ruleValue.
 * The ith item is said to match the rule if one of the following is true:
 * ruleKey == "type" and ruleValue == typei.
 * ruleKey == "color" and ruleValue == colori.
 * ruleKey == "name" and ruleValue == namei.
 * Return the number of items that match the given rule.
 */
public class Solution {
    private static final Map<String, Integer> rule = Map.of("type", 0, "color", 1, "name", 2);

    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int index = 0, result = 0;
        return (int) items.stream()
                .filter(item -> item.get(rule.get(ruleKey)).equals(ruleValue))
                .count();
    }
}
