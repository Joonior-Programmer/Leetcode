class Solution {
public:
    int maxProfit(vector<int>& prices, int fee) {
        int ret = 0;
        int effectiveBuyPrice = prices[0];
        
        for (int i = 1; i < prices.size(); ++i){
            ret = max(ret, prices[i] - effectiveBuyPrice - fee);
            effectiveBuyPrice = min(effectiveBuyPrice, prices[i] - ret);
        }
        
        return ret;
    }
};