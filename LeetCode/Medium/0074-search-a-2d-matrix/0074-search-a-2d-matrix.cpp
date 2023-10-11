class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        int down = 0, up = matrix.size() - 1;
        int left = 0, right = matrix[0].size() - 1;
        int mid = 0;
        
        while (down <= up){
            mid = (down + up) / 2;
            
            if (matrix[mid][0] > target) up = mid - 1;
            else if (matrix[mid][0] < target) {
                if (matrix[mid][right] >= target) break;
                down = mid + 1;
            } else return true;
        }
        
        vector<int> row = matrix[mid];
        
        while (left <= right){
            mid = (left + right) / 2;
            
            if (row[mid] > target) right = mid - 1;
            else if (row[mid] < target) left = mid + 1;
            else return true;
        }
        
        return false;
    }
};