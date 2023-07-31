class Solution {
    public int maxProfit(int[] prices, int fee) {
        int ret = 0;
        int effectiveBuyPrice = prices[0];
        
        for (int i = 1; i < prices.length; ++i){
            ret = Math.max(ret, prices[i] - effectiveBuyPrice - fee);
            effectiveBuyPrice = Math.min(effectiveBuyPrice, prices[i]-ret);
        }
        
        return ret;
    }
}