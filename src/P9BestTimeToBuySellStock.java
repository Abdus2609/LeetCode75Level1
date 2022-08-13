
public class P9BestTimeToBuySellStock {

    public static int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
            minPrice = Math.min(prices[i], minPrice);
        }

        return maxProfit;

        // Non-optimal approach - won't work on big lists
        //
        // int maxProfit = 0;
        // for (int i = 0; i < prices.length - 1; i++) {
        //     int price = prices[i];
        //     int[] slicedArray = Arrays.copyOfRange(prices, i + 1, prices.length);
        //     int profit = Arrays.stream(slicedArray).max().getAsInt() - price;
        //
        //     if (profit > maxProfit) {
        //         maxProfit = profit;
        //     }
        // }
        //
        // return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7,6,4,3,1};
        System.out.println(maxProfit(prices));
    }
}