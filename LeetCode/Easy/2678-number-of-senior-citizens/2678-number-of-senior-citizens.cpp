class Solution {
public:
    int countSeniors(vector<string>& details) {
        int ret = 0;
        
        for (string v : details)
            if (60 < (v[11] - 48) * 10 + v[12] - 48) ++ret;
        
        return ret;
    }
};