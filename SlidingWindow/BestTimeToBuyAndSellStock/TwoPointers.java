// Time: O(n)
// Space: O(1)

package SlidingWindow.BestTimeToBuyAndSellStock;

public class TwoPointers {
    public int maxProfit(int[] prices) {
        // l: buy, r: sell
        int l = 0, r = 1;
        // max profit
        int maxP = 0;

        while (r < prices.length) {
            if (prices[l] < prices[r]) {
                int profit = prices[r] - prices[l];
                maxP = Math.max(maxP, profit);
            } 
            // update buy to sell pointer because a lower price is found
            else {
                l = r;
            }
            r++;
        }
        return maxP;
    }
}