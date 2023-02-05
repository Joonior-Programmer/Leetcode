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
    bool hasPathSum(TreeNode* root, int targetSum) {
        return DFS(root, 0, targetSum);
    }
    
    bool DFS(TreeNode* node, int sum, int targetSum){
        if (node && !node->left && !node->right && sum + node->val == targetSum){
            return true;
        }
        if (!node) return false;
        
        return DFS(node->left, sum+node->val, targetSum) || DFS(node->right, sum+node->val, targetSum);
    }
};