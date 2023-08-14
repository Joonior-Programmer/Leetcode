class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int ret = 0;
        int[] candies = new int[n];
        
        
        for (int i = 0; i < n; ++i) ++candies[i];
        
        for (int i = 1; i < n; ++i) if (ratings[i] > ratings[i-1] && candies[i] <= candies[i-1]) candies[i] = candies[i-1] + 1;
        
        for (int i = n - 2; i > -1; i--) if (ratings[i] > ratings[i+1] && candies[i] <= candies[i+1]) candies[i] = candies[i+1] + 1;
        
        for (int i = 0; i < n; ++i) ret += candies[i];
        
        return ret;
    }
}