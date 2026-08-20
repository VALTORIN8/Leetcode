class Solution {
    public int maxProfit(int[] prices, int fee) {
        int n = prices.length;
        int cash = 0;          // profit when we don't hold stock
        int hold = -prices[0]; // profit when we hold stock

        for (int i = 1; i < n; i++) {
            // either keep cash, or sell today
            cash = Math.max(cash, hold + prices[i] - fee);
            // either keep hold, or buy today
            hold = Math.max(hold, cash - prices[i]);
        }

        return cash; // max profit when not holding stock
    }
}
  
    
