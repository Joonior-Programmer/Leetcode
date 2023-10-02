class Solution {
public:
    vector<vector<int>> combine(int n, int k) {
        vector<vector<int>> ret;
        vector<int> curr;
        helper(1, n, k, ret, curr);
        return ret;
    }
    
    void helper(int val, int n, int k, vector<vector<int>>& ret, vector<int>& curr){
        if (k == 0){
            ret.push_back(vector<int>(curr));
            return;
        }
        
        for (int i = val; i < n - k + 2; ++i){
            curr.push_back(i);
            helper(i+1, n, k-1, ret, curr);
            curr.pop_back();
        }
    }
};