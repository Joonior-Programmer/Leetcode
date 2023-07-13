class Solution {
public:
    vector<double> calcEquation(vector<vector<string>>& equations, vector<double>& values, vector<vector<string>>& queries) {
        createMap(equations, values);
        vector<double> ret(queries.size(), -1);

        for (int i = 0; i < queries.size(); ++i){
            string x = queries[i][0];
            string y = queries[i][1];
            
            if (map.find(x) == map.end() || map.find(y) == map.end()) ret[i] = -1;
            else if (x == y) ret[i] = 1;
            else {
                unordered_set<string> temp;
                double value = DFS(x, y, temp);

                if (value != -1){
                    map[x][y] = value;
                    map[y][x] = 1 / value;
                }
                
                ret[i] = value;
            }
        }
        
        return ret;
    }
    
private:
    unordered_map<string, unordered_map<string, double>> map;
    
    void createMap(vector<vector<string>>& equations, vector<double>& values){
        for (int i = 0; i < equations.size(); ++i){
            string x = equations[i][0];
            string y = equations[i][1];
            
            if (map.find(x) != map.end()) map[x][y] = values[i];
            else {
                unordered_map<string, double> temp;
                temp[y] = values[i];
                map[x] = temp;
            }
            
            if (map.find(y) != map.end()) map[y][x] = 1 / values[i];
            else {
                unordered_map<string, double> temp;
                temp[x] = 1 / values[i];
                map[y] = temp;
            }
        }
    }
    
    double DFS(string node, string target, unordered_set<string>& visited){
        if (map.find(node) != map.end() && map[node].find(target) != map[node].end()) return map[node][target];
        
        visited.insert(node);
        
        double ret = -1;
        
        for (auto v : map[node]){
            if (visited.find(v.first) == visited.end()){
                ret = DFS(v.first, target, visited);
                
                if (ret != -1) {
                    ret *= map[node][v.first];
                    map[node][target] = ret;
                    map[target][node] = 1 / ret;
                    break;
                }
            }
        }
        
        return ret;
    }
};