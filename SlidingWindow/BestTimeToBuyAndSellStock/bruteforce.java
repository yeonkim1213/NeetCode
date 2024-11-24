// Time: O(n^2) - n: number of prices
// Space: O(1) - res, buy, sell

package SlidingWindow.BestTimeToBuyAndSellStock;

public class bruteforce {
    public int maxProfit(int[] prices) {
        int res = 0;
        for (int i = 0; i < prices.length; i++) {
            int buy = prices[i];
            for (int j = i + 1; j < prices.length; j++) {
                int sell = prices[j];
                res = Math.max(res, sell - buy);
            }
        }
        return res;
    }
}
