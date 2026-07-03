
class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int sell, buy;
        int count = 0;
        int maxprofit=0;
        buy = prices[0];
        for(int i =0 ; i< n ; i++){
            if ( prices[i]<buy){
                buy = prices[i];
                count++;
            }
            if(prices[i]-buy>maxprofit){
                maxprofit=prices[i]-buy;
            }
        }
        return maxprofit;
        
    }
}