import java.util.HashMap;
import java.util.*;

public class P10LongestPalindrome {
    public static int longestPalindrome(String s) {
        if (s.length() > 2000) {
            return 0;
        }

        Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        int evenOccurrencesLength 
            = map
                .values()
                .stream()
                .filter(v -> v % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
        
        int maxOddLength
            = map
                .values()
                .stream()
                .filter(v -> v % 2 != 0)
                .mapToInt(Integer::intValue)
                .max()
                .orElse(0);
        
        int oddOccurrencesLength
            = map
                .values()
                .stream()
                .filter(v -> v % 2 != 0)
                .mapToInt(Integer::intValue)
                .map(i -> i - 1)
                .sum();
        
        if (maxOddLength != 0) {
            oddOccurrencesLength -= (maxOddLength - 1);
        }

        return maxOddLength + evenOccurrencesLength + oddOccurrencesLength;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("bb"));
    }
}
