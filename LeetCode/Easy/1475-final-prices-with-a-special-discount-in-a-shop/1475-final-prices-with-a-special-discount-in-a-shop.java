class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        int[] ret = new int[n];

        for (int i = 0; i < n; ++i){
            int v = prices[i];
            for (int j = i + 1; j < n; ++j)
                if (prices[j] <= prices[i]){
                    v -= prices[j];
                    break;
                }
            ret[i] = v;
        }
        
        return ret;
    }
}