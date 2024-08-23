class Solution {
public:
    int maximumProduct(vector<int>& nums) {
        int max1 = INT_MIN, max2 = INT_MIN, max3 = INT_MIN;
        int min1 = INT_MAX, min2 = INT_MAX;
        
        for (int v : nums){
            if (v > max1) {
                max3 = max2;
                max2 = max1;
                max1 = v;
            } else if (v > max2) {
                max3 = max2;
                max2 = v;
            } else if (v > max3) {
                max3 = v;
            }
            
            if (v < min1) {
                min2 = min1;
                min1 = v;
            } else if (v < min2) {
                min2 = v;
            }
        }
        
        return max(max1 * max2 * max3, max1 * min1 * min2);
    }
};