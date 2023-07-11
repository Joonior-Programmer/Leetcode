class Solution {
public:
    vector<std::vector<int>> graph;
    vector<bool> visited;

    int minReorder(int n, std::vector<std::vector<int>>& connections) {
        graph.resize(n);
        visited.resize(n);

        for (int i = 0; i < n; ++i)
            graph[i] = vector<int>();

        for (int i = 0; i < connections.size(); ++i) {
            graph[connections[i][0]].push_back(connections[i][1]);
            graph[connections[i][1]].push_back(-connections[i][0]);
        }

        return DFS(0);
    }

    int DFS(int curr) {
        visited[curr] = true;

        int ret = 0;

        for (int i = 0; i < graph[curr].size(); ++i) {
            int next = graph[curr][i];
            if (!visited[abs(next)]) {
                if (0 < next)
                    ++ret;
                ret += DFS(abs(next));
            }
        }

        return ret;
    }
};