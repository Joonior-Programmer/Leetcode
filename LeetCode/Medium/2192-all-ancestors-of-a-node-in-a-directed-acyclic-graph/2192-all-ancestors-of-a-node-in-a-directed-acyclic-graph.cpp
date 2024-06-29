class Solution {
public:
    vector<vector<int>> getAncestors(int n, vector<vector<int>>& edges) {
        vector<unordered_set<int>> graph(n);
        vector<vector<bool>> ances(n, vector<bool>(n, false));
        vector<vector<int>> ret(n);
        vector<int> lev(n, 0);
        queue<int> q;
        
        for (const vector<int>& edge : edges) {
            graph[edge[0]].insert(edge[1]);
            ++lev[edge[1]];
        }
        
        for (int i = 0; i < n; ++i) {
            if (lev[i] == 0) {
                q.push(i);
            }
        }
        
        while (!q.empty()) {
            int curr = q.front();
            q.pop();
            
            for (int v : graph[curr]) {
                if (!ances[v][curr]) {
                    ances[v][curr] = true;
                    
                    for (int i = 0; i < n; ++i) {
                        if (ances[curr][i]) {
                            ances[v][i] = true;
                        }
                    }
                }
                
                --lev[v];
                
                if (lev[v] == 0) {
                    q.push(v);
                }
            }
        }
        
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                if (ances[i][j]) {
                    ret[i].push_back(j);
                }
            }
        }
        
        return ret;
    }
};