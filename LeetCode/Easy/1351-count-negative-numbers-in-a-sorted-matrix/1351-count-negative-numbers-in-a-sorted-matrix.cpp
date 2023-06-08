class Solution {
public:
    int countNegatives(vector<vector<int>>& grid) {
        int end = grid[0].size();
        int ret = 0;
        int left;
        int right;
        int mid;
        
        for (int row = 0; row < grid.size(); ++row){
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
};