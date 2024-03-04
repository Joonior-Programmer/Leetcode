class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int curr = 0;
        int ret = 0;
        int l = 0;
        int r = tokens.length - 1;
        
        while (l <= r){
            if (tokens[l] <= power){
                ++curr;
                power -= tokens[l];
                ++l;
                ret = Math.max(ret, curr);
            } else if (ret > 0){
                power += tokens[r];
                curr--;
                r--;
            } else break;
        }
        
        return ret;
    }
}