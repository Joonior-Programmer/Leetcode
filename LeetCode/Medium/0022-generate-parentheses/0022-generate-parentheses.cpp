class Solution {
public:
    int target;
    vector<string> ret;
    string curr;
    vector<string> generateParenthesis(int n) {
        target = n * 2;
        
        dfs(0, 0);
        return ret;
    }
    
    void dfs(int l, int r){
        if (l + r == target){
            ret.push_back(curr);
            return;
        }
        
        if (l < target / 2){
            curr += "(";
            dfs(l + 1, r);
            curr.pop_back();
        }
        
        if (r < l){
            curr += ")";
            dfs(l, r + 1);
            curr.pop_back();
        }
    }
};