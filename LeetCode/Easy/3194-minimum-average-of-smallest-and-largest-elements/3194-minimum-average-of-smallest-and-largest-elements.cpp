class Solution {
public:
    double minimumAverage(vector<int>& nums) {
        vector<int> count(51);
        int l = 1;
        int r = 50;
        double ret = 999;
        
        for (int v : nums) ++count[v];
        
        while (l <= r){
            while (l <= r && count[l] < 1) ++l;
            while (l <= r && count[r] < 1) r--;
            
            if (l > r) break;
            
            ret = min(ret, (double)(l+r) / 2);
            count[l]--;
            count[r]--;
        }
        
        return ret;
    }
};