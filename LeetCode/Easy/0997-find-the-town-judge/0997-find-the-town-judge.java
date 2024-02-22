class Solution {
    public int findJudge(int n, int[][] trust) {
        boolean[] isJudge = new boolean[n+1];
        int[] count = new int[n+1];
        
        for (int[] v : trust){
            isJudge[v[0]] = true;
            ++count[v[1]];
        }
        
        for (int i = 1; i < n+1; ++i)
            if (!isJudge[i] && count[i] == n - 1) return i;
        
        return -1;
    }
}