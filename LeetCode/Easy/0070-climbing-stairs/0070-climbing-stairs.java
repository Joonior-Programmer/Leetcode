class Solution {
    public int climbStairs(int n) {
        int[] pib = new int[Math.max(2,n)];
        pib[0] = 1;
        pib[1] = 2;
        for (int i = 2; i < n; ++i) pib[i] = pib[i-1] + pib[i-2];
        
        return pib[n-1];
    }
}