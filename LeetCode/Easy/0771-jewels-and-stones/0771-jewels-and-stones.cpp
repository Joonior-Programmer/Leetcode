class Solution {
public:
    int numJewelsInStones(string jewels, string stones) {
        vector<bool> types(128);
        int ret = 0;
        
        for (char jewel : jewels) types[jewel] = true;
        
        for (char stone : stones)
            if (types[stone]) ++ret;
        
        return ret;
    }
};