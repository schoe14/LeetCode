import java.util.*;

/**
 * You are given the array paths, where paths[i] = [cityAi, cityBi] means there exists a direct path going from cityAi to cityBi.
 * Return the destination city, that is, the city without any path outgoing to another city.
 * It is guaranteed that the graph of paths forms a line without any loop, therefore, there will be exactly one destination city.
 */
public class Solution {
    public String destCity(List<List<String>> paths) {
        Set<String> set= new HashSet<>();
        for (List<String> l: paths) set.add(l.get(1));
        for (List<String> l: paths) set.remove(l.get(0));
        return set.iterator().next();
    }
}
