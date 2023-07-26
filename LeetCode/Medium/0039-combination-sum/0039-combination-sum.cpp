class Solution {
public:
    vector<vector<int>> ret;
    vector<vector<int>> combinationSum(vector<int>& candidates, int target) {
        vector<int> curr;
        DFS(curr, 0, 0, candidates, target);
        return this->ret;
    }
    
    void DFS(vector<int>& curr, int idx, int sum, vector<int>& candidates, int target){
        if (sum == target) {
            ret.push_back(curr);
            return;
        }
        if (idx >= candidates.size() || sum > target) return;
        
        curr.push_back(candidates[idx]);
        DFS(curr, idx, sum + candidates[idx], candidates, target);
        curr.pop_back();
        DFS(curr, idx + 1, sum, candidates, target);
    }
};