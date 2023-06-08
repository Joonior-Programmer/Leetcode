class Solution {
    public int countNegatives(int[][] grid) {
        int end = grid[0].length;
        int ret = 0;
        int left;
        int right;
        int mid;
        for (int row = 0; row < grid.length; ++row){
            left = 0;
            right = end - 1;
            while (left <= right){
                mid = (left + right) / 2;
                
                if (grid[row][mid] > -1) left = mid + 1;
                else right = mid - 1;
            }
            
            ret += end - left;
        }
        
        return ret;
    }
}