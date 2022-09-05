import java.util.ArrayList;

import java.util.*;

public class P29LastStoneWeight {
    
    public static int lastStoneWeight(int[] stones) {
        List<Integer> stoneList = new ArrayList<>();
        
        for (int stone : stones) {
            stoneList.add(stone);
        }

        while (stoneList.size() > 1) {
            Collections.sort(stoneList, Collections.reverseOrder());

            int x = stoneList.get(1);
            int y = stoneList.get(0);

            stoneList.remove(1);
            stoneList.remove(0);

            if (y > x) {
                stoneList.add(y - x);
            }
        }

        return stoneList.isEmpty() ? 0 : stoneList.get(0);
    }
}
