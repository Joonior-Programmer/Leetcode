/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    int distance;
    int ret = 0;
    
    int countPairs(TreeNode* root, int distance) {
        this->distance = distance;
        
        dfs(root);
        
        return ret;
    }
    
    vector<int> dfs(TreeNode* node){
        if (!node) return vector<int>{};
        
        vector<int> l = dfs(node->left);
        vector<int> r = dfs(node->right);
        
        int n = l.size();
        int m = r.size();
        
        if (n + m == 0) return vector<int>{1};
        
        for (int v0 : l){
            if (v0 >= distance) continue;
            
            for (int v1 : r)
                if (v0 + v1 <= distance) ++ret;
        }
        
        int i = 0;
        vector<int> returnVal(n+m);
        
        for (int j = 0; j < n; j++) returnVal[i++] = l[j] + 1;
        for (int j = 0; j < m; j++) returnVal[i++] = r[j] + 1;
        
        return returnVal;
    }
};