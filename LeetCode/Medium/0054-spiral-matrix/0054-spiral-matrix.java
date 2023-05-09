class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ret = new ArrayList<>();
        int left = 0;
        int right = matrix[0].length;
        int top = 0;
        int bottom = matrix.length;
        while (left < right && top < bottom) {
            for (int i = left; i < right; ++i) ret.add(matrix[top][i]);
            ++top;
            
            for (int i = top; i < bottom; ++i) ret.add(matrix[i][right-1]);
            right--;
            
            if (left >= right || top >= bottom) break;
            
            for (int i = right - 1; i > left - 1; i--) ret.add(matrix[bottom-1][i]);
            bottom--;
            
            for (int i = bottom - 1; i > top - 1; i--) ret.add(matrix[i][left]);
            ++left;
        }
        return ret;
    }
}