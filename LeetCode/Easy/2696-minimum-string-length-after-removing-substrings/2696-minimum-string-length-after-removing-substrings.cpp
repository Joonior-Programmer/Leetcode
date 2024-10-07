class Solution {
public:
    int minLength(string s) {
        int n = s.size();
        vector<char> stack(n);
        
        int j = 0;
        
        for (int i = 0; i < n; ++i){
            char v = s[i];
            
            if (j > 0 && ((stack[j-1] == 'A' && v == 'B') || (stack[j-1] == 'C' && v == 'D'))) j--;
            else stack[j++] = v;
        }
        
        return j;          
    }
};