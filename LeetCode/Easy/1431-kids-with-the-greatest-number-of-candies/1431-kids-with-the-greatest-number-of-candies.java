class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Integer.MIN_VALUE;
        List<Boolean> ret = new ArrayList<>();
        for (int i = 0; i < candies.length; ++i) max = Math.max(max, candies[i]);
        
        max -= extraCandies;
        
        for (int i = 0; i < candies.length; ++i) ret.add(max - candies[i] < 1);
        
        return ret;
    }
}