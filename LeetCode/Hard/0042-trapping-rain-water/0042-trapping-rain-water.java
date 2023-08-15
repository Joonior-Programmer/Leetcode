class Solution {
    public int trap(int[] height) {
        int maxNum = 0;
        int ret = 0;
        int l = 0, r = 1, n = height.length;
         
        while (l < n){
            if (height[l] > 0){
                maxNum = height[l];
                break;
            }
            ++l;
        }
        
        r = l + 1;

        while (r < n){
            if (height[r] >= maxNum){
                for (int i = l + 1; i < r; ++i) ret += maxNum - height[i];
                l = r;
                maxNum = height[r];
            }
            ++r;
        }
        
        r -= 1;
        
        
        while (r > l){
            if (height[r] > 0) {
                maxNum = height[r];
                break;
            }
            r--;
        }
        
        int newL = r - 1;

        while (newL >= l){
            if (height[newL] >= maxNum){
                for (int i = newL + 1; i < r; ++i) ret += maxNum - height[i];
                r = newL;
                maxNum = height[newL];
            }
            newL--;
        }
        
        return ret;
    }
}