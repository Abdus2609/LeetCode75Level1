import java.util.*;

public class P30TopKFrequentWords {
    
    public static List<String> topKFrequent(String[] words, int k) {
        List<String> result = new ArrayList<>();

        Map<String, Integer> map = new HashMap<>();
        for (String s : words) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        result = new ArrayList<>(map.keySet());
        Collections.sort(result, (x, y) -> map.get(x) != map.get(y) ? map.get(y) - map.get(x) : x.compareTo(y));

        return result.subList(0, k);
    }
}
