class Solution {
public:
    int countKeyChanges(string s) {
        int ret = 0;
        char prev = s[0];
        
        for (int i = 1; i < s.size(); ++i){
            char temp = s[i];
            if (temp - 32 != prev && temp + 32 != prev && temp != prev) ++ret;
            prev = temp;
        }
        
        return ret;
    }
};