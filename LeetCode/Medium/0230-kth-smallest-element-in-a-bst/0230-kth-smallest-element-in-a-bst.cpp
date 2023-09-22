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
    int k;
    int idx = 0;
    int kthSmallest(TreeNode* root, int k) {
        vector<int> ret(k, -1);
        this->k = k;
        
        dfs(root, ret);
        
        return ret[k-1];
    }
    
    void dfs(TreeNode* node, vector<int>& ret){
        if (!node) return;
        
        dfs(node->left, ret);
        
        if (idx < k) ret[idx++] = node->val;
        else return;
        
        dfs(node->right, ret);
    }
};