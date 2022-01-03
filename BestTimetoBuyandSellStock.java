//121. Best Time to Buy and Sell Stock

class Solution {
    public int maxProfit(int[] prices) {
        int minValue = prices[0];
        int maxvalue = prices[0];
        if(prices.length==1) return 0;
        
        int size = 0;
        
        for(int i=1; i<prices.length;i++){
            
            if(prices[i] <minValue) minValue=prices[i];
            
            if(prices[i] > minValue) size = Math.max(size,(prices[i] -minValue));
        }
        return size;
    }
}
