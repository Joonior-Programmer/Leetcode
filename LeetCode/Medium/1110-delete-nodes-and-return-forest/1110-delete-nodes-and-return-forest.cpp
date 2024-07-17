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
    vector<TreeNode*> ret;
    vector<bool> del;
    
    Solution() : del(1001, false) {}
    
    vector<TreeNode*> delNodes(TreeNode* root, vector<int>& to_delete) {
        for (int i = 0; i < to_delete.size(); ++i) this->del[to_delete[i]] = true;
        
        dfs(root, !del[root->val]);
        
        return ret;
    }
    
    TreeNode* dfs(TreeNode* node, bool isRoot){
        if (!node) return nullptr;
        
        if (isRoot && !del[node->val]) ret.push_back(node);
        
        node->left = dfs(node->left, del[node->val]);
        node->right = dfs(node->right, del[node->val]);
        
        if (del[node->val]) return nullptr;
        
        return node;
    }
};