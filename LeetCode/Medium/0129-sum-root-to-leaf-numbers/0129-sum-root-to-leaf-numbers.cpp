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
    int sumNumbers(TreeNode* root) {
        return dfs(root, 0);
    }
    
    int dfs(TreeNode* node, int sum){
        if (!node->left && !node->right) return sum * 10 + node->val;
        int ret = 0;
        if (node->left) ret += dfs(node->left, sum * 10 + node->val);
        if (node->right) ret += dfs(node->right, sum * 10 + node->val);
        return ret;
    }
};