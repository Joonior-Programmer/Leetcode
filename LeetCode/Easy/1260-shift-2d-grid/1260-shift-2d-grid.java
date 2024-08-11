class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int row_len = grid.length;
        int col_len = grid[0].length;
        int total = row_len * col_len;
        int[] vals = new int[total];
        
        int i = 0;
        
        for (int[] row : grid)
            for (int v : row){
                vals[i++] = v;
            }
        
        i -= k;
        i = (i % total + total) % total;

        List<List<Integer>> ret = new ArrayList<>();
        for (int row = 0; row < row_len; ++row) {
            List<Integer> listRow = new ArrayList<>();
            for (int col = 0; col < col_len; ++col) {
                listRow.add(vals[i++]);
                if (i >= total) i = 0;
            }
            ret.add(listRow);
        }
        
        return ret;
    }
}