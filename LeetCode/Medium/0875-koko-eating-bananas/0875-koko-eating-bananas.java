class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = 0;
        
        for (int i = 0; i < piles.length; ++i) r = Math.max(r, piles[i]);
        
        while (l <= r){
            int mid = (l + r) >> 1;

            int time = 0;
            
            for (int i = 0; i < piles.length; ++i) time += (double) piles[i] / mid + (piles[i] % mid != 0 ? 1 : 0);

            if (time > h) l = mid + 1;
            else r = mid - 1;
        }
        
        return l;
    }
}