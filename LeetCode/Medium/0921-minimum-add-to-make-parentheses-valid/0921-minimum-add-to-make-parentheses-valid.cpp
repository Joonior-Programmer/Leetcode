class Solution {
public:
    int minAddToMakeValid(string s) {
        int n = s.size();
        vector<char> stack(n);
        int j = 0;
        
        for (char v : s)
            if (j > 0 && stack[j-1] == '(' && v == ')') j--;
            else stack[j++] = v;
        
        return j;
    }
};