class Solution {
    public int findCenter(int[][] edges) {
        int n = edges.length;
        boolean[] count = new boolean[n+2];
        
        for (int[] v : edges){
            if (count[v[0]]) return v[0];
            if (count[v[1]]) return v[1];
            count[v[0]] = true;
            count[v[1]] = true;
        }

        return -1;
    }
}