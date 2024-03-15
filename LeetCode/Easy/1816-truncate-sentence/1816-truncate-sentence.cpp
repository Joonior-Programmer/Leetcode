class Solution {
public:
    string truncateSentence(string s, int k) {
        int n = s.size();
        int i = 0;
        
        while (i < n){
            if (s[i++] == ' ') {
                k--;
                if (k == 0) {
                    i--;
                    break;
                }
            }
        }
        
        return s.substr(0, i);
    }
};