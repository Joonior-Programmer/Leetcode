class Solution {
    public long maximumImportance(int n, int[][] roads) {
        int[] count = new int[n];
        int[] order = new int[n+1];
        long ret = 0;
        int idx = n;
        long val = n;
        
        for (int[] v : roads){
            ++count[v[0]];
            ++count[v[1]];
        }
        
        for (int v : count) order[v]++;
        
        
        while (idx > 0){
            while (idx > 0 && order[idx] < 1) idx--;
            if (idx == 0) break;
            order[idx]--;
            ret += idx * val--;
        }
        
        return ret;
    }
}