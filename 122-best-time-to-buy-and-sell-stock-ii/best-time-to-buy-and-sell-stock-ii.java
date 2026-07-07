class Solution {
    public int maxProfit(int[] prices) {
        ///hoga ye??//ha ig
        int buy=0;
        int sell=0;
        int profit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>prices[i-1]){
                profit+=prices[i]-prices[i-1];
            }
        }
        return profit;
    }
}