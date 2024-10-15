class Solution {
public:
    long long minimumSteps(string s) {
        ios::sync_with_stdio(0);
        cin.tie(0);
        
        int curr = 0;
        long ret = 0;
        
        for (char v : s)
            if (v == '1') ++curr;
            else ret += curr;
        
        return ret;
    }
};