class Solution {
public:
    int findCircleNum(vector<vector<int>>& isConnected) {
        vector<bool> visited(isConnected.size(), false);
        int ret = 0;
        
        for (int i = 0; i < isConnected.size(); ++i){
            if (!visited[i]) {
                DFS(i, isConnected, visited);
                ++ret;
            }
        }
        
        return ret;
    }
    
    void DFS(int curr, vector<vector<int>>& graph, vector<bool>& visited){
        visited[curr] = true;
        
        for (int i = 0; i < graph.size(); ++i){
            if (graph[curr][i] == 1 && !visited[i]) DFS(i, graph, visited);
        }
    }
};