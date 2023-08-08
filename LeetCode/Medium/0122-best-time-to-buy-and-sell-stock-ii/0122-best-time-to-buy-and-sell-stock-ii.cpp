class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int ret = 0;
        int effectiveBuy = 10000;
        
        for (int i = 0; i < prices.size(); ++i){
            ret = max(ret, prices[i] - effectiveBuy);
            effectiveBuy = min(effectiveBuy, prices[i] - ret);
        }
        
        return ret;
    }
};