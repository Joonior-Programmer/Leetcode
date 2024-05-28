class Solution {
public:
    int equalSubstring(string s, string t, int maxCost) {
        int n = s.size();
        vector<int> diff(n);
        int ret = 0;
        
        int l = 0, r = 0, curr = 0;

        for (int i = 0; i < n; ++i) diff[i] = abs(s[i] - t[i]);
        
        while (r < n){
            curr += diff[r++];
            
            if (curr > maxCost) curr -= diff[l++];

            ret = max(ret, r - l);
        }
        
        return ret;
    }
};