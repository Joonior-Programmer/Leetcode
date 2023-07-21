class Solution {
public:
    vector<vector<int>> ret;
    int k;
    int n;
    int last;
    
    vector<vector<int>> combinationSum3(int k, int n) {
        this->k = k;
        this->n = n;
        last = min(n, 10);
        
        vector<int> temp(k, 0);
        DFS(temp, 0, 0, 1);
        
        return ret;
    }
    
    void DFS(vector<int> curr, int idx, int currSum, int start){
        if (idx == k){
            if (currSum == n) ret.push_back(curr);
            return;
        }
        
        for (int i = start; i < last; ++i){
            if (currSum + i > n) return;
            curr[idx] = i;
            DFS(curr, idx + 1, currSum + i, i + 1);
        }
    }
};