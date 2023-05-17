class Solution {
public:
    vector<bool> kidsWithCandies(vector<int>& candies, int extraCandies) {
        int max = candies[0];
        vector<bool> ret;
        for (int i = 1; i < candies.size(); ++i) {
            if (candies[i] > max) max = candies[i];
        }
        
        max -= extraCandies;
        
        for (int i = 0; i < candies.size(); ++i) ret.push_back(candies[i] >= max);
        
        return ret;
    }
};