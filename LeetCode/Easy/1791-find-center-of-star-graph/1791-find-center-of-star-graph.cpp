class Solution {
public:
    int findCenter(vector<vector<int>>& edges) {
        int n = edges.size();
        vector<bool> count(n+2);
        
        for (vector<int>& v : edges){
            if (count[v[0]]) return v[0];
            if (count[v[1]]) return v[1];
            count[v[0]] = true;
            count[v[1]] = true;
        }

        return -1;
    }
};