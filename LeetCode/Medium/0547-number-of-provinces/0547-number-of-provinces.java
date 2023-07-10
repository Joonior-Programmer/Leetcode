class Solution {
    int[][] graph;
    boolean[] visited;
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        int ret = 0;
        visited = new boolean[n];
        graph = isConnected;
        
        for (int i = 0; i < n; ++i){
            if (!visited[i]) {
                DFS(i);
                ++ret;
            }
        }

        return ret;
    }

    private void DFS(int curr){
        visited[curr] = true;

        for (int i = 0; i < graph.length; ++i){
            if (graph[curr][i] == 1 && !visited[i]) DFS(i);
        }
    }
}