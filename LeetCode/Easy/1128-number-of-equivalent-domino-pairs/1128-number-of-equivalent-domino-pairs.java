class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int[][] count = new int[10][10];
        int ret = 0;
        
        for (int i = 0; i < dominoes.length; ++i){
            int v1 = dominoes[i][0];
            int v2 = dominoes[i][1];
            
            if (v1 < v2) ++count[v1][v2];
            else ++count[v2][v1];
        }
        
        for (int i = 1; i < 10; ++i)
            for (int j = 1; j < 10; ++j) 
                ret += (count[i][j]*(count[i][j]-1))/2;
            
        return ret;
    }
}