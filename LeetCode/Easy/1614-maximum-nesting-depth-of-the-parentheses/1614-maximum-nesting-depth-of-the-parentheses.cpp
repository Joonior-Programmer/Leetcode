class Solution {
public:
    int maxDepth(string s) {
        int ret = 0;
        int curr = 0;
        
        for (char v : s)
            if (v == '(') {
                ++curr;
                if (curr > ret) ret = curr;
            } else if (v == ')') curr--;
        
        return ret;
    }
};