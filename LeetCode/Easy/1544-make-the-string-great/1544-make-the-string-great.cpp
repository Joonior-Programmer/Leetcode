class Solution {
public:
    string makeGood(string s) {
        string ret = "";
        
        for (char v : s){
            int len = ret.size();
            if (len > 0 && abs(ret[len-1] - v) == 32) ret.pop_back();
            else ret += v;
        }
        
        return ret;
    }
};