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
    int prev = INT_MAX;
    int ret = INT_MAX;
    int getMinimumDifference(TreeNode* root) {
        DFS(root);
        return ret;
    }
    
    void DFS(TreeNode* node){
        if (!node) return;
        DFS(node->left);
        if (node->val - prev > 0 && node->val - prev < ret) ret = node->val - prev;
        prev = node->val;
        DFS(node->right);
    }
};