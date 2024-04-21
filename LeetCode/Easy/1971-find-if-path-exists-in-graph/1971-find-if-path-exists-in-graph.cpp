class Solution {
public:
    bool validPath(int n, vector<vector<int>>& edges, int source, int destination) {
        if (source == destination) {
            return true;
        }

        unordered_map<int, unordered_set<int>> graph;
        vector<bool> visited(n, false);
        stack<int> st;

        for (const auto& edge : edges) {
            int v0 = edge[0];
            int v1 = edge[1];
            graph[v0].insert(v1);
            graph[v1].insert(v0);
        }

        visited[source] = true;
        st.push(source);

        while (!st.empty()) {
            vector<int> temp;

            while (!st.empty()) {
                int now = st.top();
                st.pop();

                for (int v : graph[now]) {
                    if (!visited[v] && graph[v].count(now)) {
                        if (v == destination) {
                            return true;
                        }
                        visited[v] = true;
                        temp.push_back(v);
                    }
                }
            }

            for (int v : temp) {
                st.push(v);
            }
        }

        return false;
    }
};