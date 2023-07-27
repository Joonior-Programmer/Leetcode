class Solution {
public:
    vector<vector<int>> ret;
    
    vector<vector<int>> combinationSum2(vector<int>& candidates, int target) {
        sort(candidates.begin(), candidates.end());
        vector<int> curr;
        DFS(curr, 0, 0, candidates, target);   
        return ret;
    }
    
    void DFS(vector<int>& curr, int idx, int sum, vector<int>& candidates, int target){
        if (sum == target){
            ret.push_back(curr);
            return;
        }
        
        if (idx >= candidates.size() || sum > target ) return;
        
        curr.push_back(candidates[idx]);
        DFS(curr, idx + 1, sum + candidates[idx], candidates, target);
        curr.pop_back();
        
        int temp = idx + 1;
        while (temp < candidates.size() && candidates[temp] == candidates[idx]) ++temp;
        DFS(curr, temp, sum, candidates, target);
    }
};