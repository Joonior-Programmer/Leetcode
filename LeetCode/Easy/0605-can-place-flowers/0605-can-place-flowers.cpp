class Solution {
public:
    bool canPlaceFlowers(vector<int>& flowerbed, int n) {
        int count = 1;
        for (int i = 0; i < flowerbed.size(); ++i){
            if (flowerbed[i]) count = 0;
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
};