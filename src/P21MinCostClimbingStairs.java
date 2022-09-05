public class P21MinCostClimbingStairs {
    public static int minCostClimbingStairs(int[] cost) {        
        int first = cost[0];
        int second = cost[1];
        int currCost = 0;
        for (int i = 2; i < cost.length; i++) {
            currCost = Math.min(first, second) + cost[i];
            first = second;
            second = currCost;
        }

        return Math.min(first, second);
    }
}