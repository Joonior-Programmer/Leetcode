class Solution {
public:
    int maxArea(vector<int>& height) {
        int i = 0;
        int j = height.size()-1;
        int ret = 0;
        while (i < j){
            ret = max(ret, min(height[i], height[j]) * (j-i));
            if (height[i] > height[j]) j--;
            else ++i;
        }
        return ret;
    }
};