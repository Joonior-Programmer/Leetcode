class Solution {
public:
    int minimumLength(string s) {
        int l = 0;
        int r = s.size() - 1;
        
        while (l < r){
            if (s[l] == s[r]){
                char temp = s[l++];
                
                while (l <= r && s[l] == temp) ++l;
                while (l <= r && s[r] == temp) r--;
            } else break;
        }
        
        return max(0, r - l + 1);
    }
};