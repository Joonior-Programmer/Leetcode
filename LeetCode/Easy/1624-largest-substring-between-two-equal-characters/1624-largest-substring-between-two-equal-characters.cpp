class Solution {
public:
    int maxLengthBetweenEqualCharacters(string s) {
        vector<int> idx(26, -1);
        int ret = -1;
        
        for (int i = 0; i < s.length(); ++i){
            int temp = s[i] - 'a';
            
            if (idx[temp] != -1) ret = max(ret, i-idx[temp]-1);
            else idx[temp] = i;
        }
        
        return ret;
    }
};