class Solution {
    public int heightChecker(int[] heights) {
        int ret = 0;
        int[] compare = heights.clone();
        Arrays.sort(compare);
        
        
        for (int i = 0; i < heights.length; ++i)
            if (heights[i] != compare[i]) ++ret;
        
        return ret;
    }
}