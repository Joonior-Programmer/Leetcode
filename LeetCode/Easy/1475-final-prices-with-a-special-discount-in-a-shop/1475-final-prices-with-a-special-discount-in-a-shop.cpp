class Solution {
public:
    vector<int> finalPrices(vector<int>& prices) {
        int n = prices.size();
        vector<int> ret(n);

        for (int i = 0; i < n; ++i){
            int v = prices[i];
            for (int j = i + 1; j < n; ++j)
                if (prices[j] <= prices[i]){
                    v -= prices[j];
                    break;
                }
            ret[i] = v;
        }
        
        return ret;
    }
};