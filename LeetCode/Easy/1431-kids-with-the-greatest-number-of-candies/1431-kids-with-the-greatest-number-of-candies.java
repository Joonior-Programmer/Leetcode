class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = candies[0];
        List<Boolean> ret = new ArrayList<>();
        for (int i = 1; i < candies.length; ++i) {
            if (candies[i] > max) max = candies[i];
        }
        
        max -= extraCandies;
        
        for (int i = 0; i < candies.length; ++i) ret.add(candies[i] >= max);
        
        return ret;
    }
}