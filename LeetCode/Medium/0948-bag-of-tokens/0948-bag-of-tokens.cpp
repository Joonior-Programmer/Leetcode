class Solution {
public:
    int bagOfTokensScore(vector<int>& tokens, int power) {
        sort(tokens.begin(), tokens.end());
        int curr = 0;
        int ret = 0;
        int l = 0;
        int r = tokens.size() - 1;
        
        while (l <= r){
            if (tokens[l] <= power){
                ++curr;
                power -= tokens[l];
                ++l;
                ret = max(ret, curr);
            } else if (ret > 0){
                power += tokens[r];
                curr--;
                r--;
            } else break;
        }
        
        return ret;
    }
};