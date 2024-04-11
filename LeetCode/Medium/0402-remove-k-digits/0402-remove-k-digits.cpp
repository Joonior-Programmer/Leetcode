class Solution {
public:
    string removeKdigits(string num, int k) {
        int n = num.size();
        vector<char> ret(1);
        ret[0] = num[0];
        
        for (int i = 1; i < n; ++i){
            char temp = num[i];
            while (k > 0 && !ret.empty()){
                if (ret.back() > temp){
                    ret.pop_back();
                    k--;
                } else break;
            }
            
            if (!ret.empty() || temp != '0') ret.push_back(temp);
        }
        
        while (k > 0 && !ret.empty()) {
            ret.pop_back();
            k--;
        }
        
        if (ret.size() == 0) return "0";
        
        string result(ret.begin(), ret.end());
        
        return result;
    }
};