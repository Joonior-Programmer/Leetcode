class Solution {
    public List<List<Integer>> getAncestors(int n, int[][] edges) {
        HashSet<Integer>[] graph = new HashSet[n];
        boolean[][] ances = new boolean[n][n];
        List<List<Integer>> ret = new ArrayList();
        int[] lev = new int[n];
        Queue<Integer> q = new LinkedList();
        
        for (int i = 0; i < n; ++i) graph[i] = new HashSet();
        for (int i = 0; i < n; ++i) ret.add(new ArrayList());
        
        for (int[] v : edges){
            graph[v[0]].add(v[1]);
            ++lev[v[1]];
        }
        
        for (int i = 0; i < n; ++i)
            if (lev[i] == 0) q.offer(i);
        
        while (!q.isEmpty()){
            int curr = q.poll();
            
            for (Integer v : graph[curr]){
                ances[v][curr] = true;
                
                for (int i = 0; i < n; ++i)
                    if (ances[curr][i]) ances[v][i] = true;
                
                lev[v]--;
                
                
                if (lev[v] == 0) q.offer(v);
            }
        }
        
        for (int i = 0; i < n; ++i){
            List<Integer> curr = ret.get(i);
            
            for (int j = 0; j < n; ++j)
                if (ances[i][j]) curr.add(j);
        }
        
        
        return ret;
    }
}