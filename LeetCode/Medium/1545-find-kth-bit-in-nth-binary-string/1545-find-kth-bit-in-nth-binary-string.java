class Solution {
    public char findKthBit(int n, int k) {
        return dfs(n, k);
    }
    
    private char dfs(int n, int k){
        if (n == 1) return '0';
        
        int len = (int)Math.pow(2, n) - 1;
        int mid = (int)Math.pow(2, n-1);
        
        if (k == mid) return '1';
        else if (k < mid) return dfs(n-1, k);
        else return dfs(n-1, len - k + 1) == '1' ? '0' : '1';
    }
}