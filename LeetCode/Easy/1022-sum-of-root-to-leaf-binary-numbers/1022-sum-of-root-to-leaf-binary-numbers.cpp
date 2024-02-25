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
    int sumRootToLeaf(TreeNode* root) {
        return dfs(root, 0);
    }
    
    int dfs(TreeNode* node, int curr){
        if (!node->left && !node->right) return curr * 2 + node->val;
        
        int ret = 0;
        curr = curr * 2 + node->val;
        
        if (node->left) ret += dfs(node->left, curr);
        if (node->right) ret += dfs(node->right, curr);
        
        return ret;
    }
};