import java.util.*;

public class P26BullsAndCows {
    
    public static String getHint(String secret, String guess) {
        int bulls = 0;
        int cows = 0;

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < secret.length(); i++) {
            char s = secret.charAt(i);
            char g = guess.charAt(i);

            if (s == g) {
                bulls++;
            } else {
                if (map.containsKey(s)) {
                    map.put(s, map.get(s) + 1);
                } else {
                    map.put(s, 1);
                }
            }
        }

        for (int i = 0; i < guess.length(); i++) {
            char s = secret.charAt(i);
            char g = guess.charAt(i);

            if (s != g) {
                if (map.containsKey(g)) {
                    cows++;
                    if (map.get(g) == 1) {
                        map.remove(g);
                    } else {
                        map.put(g, map.get(g) - 1);
                    }
                }
            }
        }

        return bulls + "A" + cows + "B";
    }
}
