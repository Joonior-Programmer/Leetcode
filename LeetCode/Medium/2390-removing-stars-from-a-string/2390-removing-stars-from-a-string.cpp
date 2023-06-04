class Solution {
public:
    string removeStars(string s) {
        string ret = "";

        for (char v : s){
            if (v != '*') ret += v;
            else if (ret.size() > 0) ret.pop_back();
        }
        return ret;
    }
};