class Solution {//nice
    public int maxProfit(int[] prices) {//tune bhi oh kra higa phele ye?
        int n = prices.length;//ha // ye line dekh meri har ques mei likhne ki addat h
        int sell, buy;//khud kra h na ye?
        int maxprofit=0;
        buy = prices[0];
        for(int i =0 ; i< n ; i++){
            if ( prices[i]<buy){
                buy = prices[i];
            
            }
            if(prices[i]-buy>maxprofit){
                maxprofit=prices[i]-buy;
            }
        }
        return maxprofit;
        
    }
}