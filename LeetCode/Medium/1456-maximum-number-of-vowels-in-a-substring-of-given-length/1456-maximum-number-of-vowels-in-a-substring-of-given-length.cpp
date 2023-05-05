class Solution {
public:
    int maxVowels(string s, int k) {
        int ret = 0;
        int prev = 0;
        int temp = 0;
        
        for (int i = 0; i < k; ++i){
            if (s[i] == 'a' || s[i] == 'e' ||
               s[i] == 'o' || s[i] == 'i' || s[i] == 'u') ++temp;
        }
        
        ret = temp;
        if (s[prev] == 'a' || s[prev] == 'e' ||
               s[prev] == 'o' || s[prev] == 'i' || s[prev] == 'u') temp--;
        ++prev;
        
        for (int i = k; i < s.length(); ++i){
            if (s[i] == 'a' || s[i] == 'e' ||
               s[i] == 'o' || s[i] == 'i' || s[i] == 'u') ++temp;
            
            ret = max(ret, temp);
            
            if (s[prev] == 'a' || s[prev] == 'e' ||
               s[prev] == 'o' || s[prev] == 'i' || s[prev] == 'u') temp--;
            ++prev;
        }
        
        return ret;
    }
};