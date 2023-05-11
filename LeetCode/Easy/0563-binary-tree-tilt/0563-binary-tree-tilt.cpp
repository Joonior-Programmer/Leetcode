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
    int ret = 0;
    int findTilt(TreeNode* root) {
        DFS(root);
        return ret;
    }
    
    int DFS(TreeNode* node) {
        if (!node) return 0;
        
        int left = DFS(node->left);
        int right = DFS(node->right);
        ret += abs(left - right);
        
        return left + right + node->val;
    }
};