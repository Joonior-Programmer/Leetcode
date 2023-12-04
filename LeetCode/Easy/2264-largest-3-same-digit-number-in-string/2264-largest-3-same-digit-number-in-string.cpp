class Solution {
public:
    string largestGoodInteger(string num) {
        string ret = "";
        int i = 0;
        
        while (i < num.size() - 2){
            if (num[i] != num[i+1]){
                ++i;
                continue;
            }
            if (num[i] != num[i+2]){
                i += 2;
                continue;
            }
            
            if (ret.size() == 0 || stoi(ret) < (num[i]-'0') * 111) ret = num.substr(i, 3);
            i += 3;
        }
        
        return ret;
    }
};