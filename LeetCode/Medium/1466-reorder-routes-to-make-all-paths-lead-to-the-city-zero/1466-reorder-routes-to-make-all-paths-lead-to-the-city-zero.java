class Solution {
    ArrayList<Integer>[] graph;
    boolean[] visited;
    public int minReorder(int n, int[][] connections) {
        graph = new ArrayList[n];
        visited = new boolean[n];
        
        for (int i = 0; i < n; ++i) graph[i] = new ArrayList<>();
        
        for (int i = 0; i < connections.length; ++i){
            graph[connections[i][0]].add(connections[i][1]);
            graph[connections[i][1]].add(-connections[i][0]);
        }
        
        return DFS(0);
    }
    
    private int DFS(int curr){
        visited[curr] = true;
        
        int ret = 0;
        
        for (int i = 0; i < graph[curr].size(); ++i){
            int next = graph[curr].get(i);
            if (!visited[Math.abs(next)]){
                if (0 < next) ++ret;
                ret += DFS(Math.abs(next));
            }
        }
        
        return ret;
    }
}