class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int ret = 0;
        while (i < j){
            ret = Math.max(ret, Math.min(height[i], height[j]) * (j-i));
            if (height[i] > height[j]) j--;
            else ++i;
        }
        return ret;
    }
}