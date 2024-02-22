class Solution {
public:
    int findJudge(int n, vector<vector<int>>& trust) {
        vector<bool> isJudge(n+1);
        vector<int> count(n+1);
        
        for (vector<int> v : trust){
            isJudge[v[0]] = true;
            ++count[v[1]];
        }
        
        for (int i = 1; i < n+1; ++i)
            if (!isJudge[i] && count[i] == n - 1) return i;
        
        return -1;
    }
};