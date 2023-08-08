class Solution {
    public int maxProfit(int[] prices) {
        int ret = 0;
        int effectiveBuy = Integer.MAX_VALUE;
        
        for (int i = 0; i < prices.length; ++i){
            ret = Math.max(ret, prices[i] - effectiveBuy);
            effectiveBuy = Math.min(effectiveBuy, prices[i] - ret);
        }
        
        return ret;
    }
}