class Solution {
    public int equalPairs(int[][] grid) {
        int n = grid.length;
        HashMap<Integer, Integer> exist = new HashMap();
        int ret = 0;
        
        
        for (int i = 0; i < n; ++i) {
            int hashed = hash(grid[i]);
            exist.put(hashed, exist.getOrDefault(hashed, 0) + 1);
        }
        
        for (int c = 0; c < n; ++c){
            int hashed = 13;

            for (int r = 0; r < n; ++r){
                hashed = hashed * 13 + grid[r][c];
            }

            ret += exist.getOrDefault(hashed, 0);
        }
        
        return ret;
    }

    private int hash(int[] arr) {
        int hashed = 13;

        for (int i = 0; i < arr.length; ++i) hashed = hashed * 13 + arr[i];

        return hashed;
    }
}