class Solution {
public:
    int firstUniqChar(string s) {
        int ret[26]{0};
        for (int i = 0; i < s.size(); ++i){
            ++ret[s[i] - 'a'];
        }
        
        for (int i = 0; i < s.size(); ++i){
            if(ret[s[i] - 'a'] == 1) return i;
        }
        return -1;
    }
};