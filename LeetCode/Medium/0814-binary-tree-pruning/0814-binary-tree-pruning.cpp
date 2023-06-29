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
    TreeNode* pruneTree(TreeNode* root) {
        DFS(root);
        
        if (root->val == 0 && !root->left && !root->right) return NULL;
        return root;
    }
    
    bool DFS(TreeNode* node){
        if (!node) return false;
        
        bool left = DFS(node->left);
        bool right = DFS(node->right);
        
        if (!left) node->left = NULL;
        if (!right) node->right = NULL;
        
        return node->val == 1 || left || right;
    }
};