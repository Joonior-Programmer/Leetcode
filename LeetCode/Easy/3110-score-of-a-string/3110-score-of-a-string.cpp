class Solution {
public:
    int scoreOfString(string s) {
        int ret = 0;
        char prev = s[0];
    
        for (int i = 1; i < s.length(); ++i){
            char temp = s[i];
            ret += abs(prev - temp);
            prev = temp;
        }
        

        return ret;
    }
};