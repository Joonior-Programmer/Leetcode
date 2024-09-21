class Solution {
public:
    vector<int> ret;
    int n;
    
    vector<int> lexicalOrder(int n) {
        this->n = n;
        
        dfs(1);
        
        return ret;
    }
    
    void dfs(int curr){
        if (curr > n) return;
        
        ret.push_back(curr);
        dfs(curr * 10);
        
        if (curr % 10 != 9) dfs(curr + 1);
    }
};