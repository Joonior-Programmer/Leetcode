class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 1;
        for (int i = 0; i < flowerbed.length; ++i){
            if (flowerbed[i] == 1) count = 0;
            else {
                if (count == 2){
                    count = 0;
                    n -= 1;
                }
                ++count;
            }
        }
        
        if (count == 2) n -= 1;
        
        return n < 1;
    }
}