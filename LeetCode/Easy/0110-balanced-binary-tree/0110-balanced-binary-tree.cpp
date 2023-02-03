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
    bool isBalanced(TreeNode* root) {
        if (!root) return true;
        return checkDepth(root) != -1;
    }
    int checkDepth(TreeNode* node){
        if (!node) return 0;
        
        int left = checkDepth(node->left);
        int right = checkDepth(node->right);
        
        if (left == -1 || right == -1) return -1;
        else if (abs(left - right) > 1) return -1;
        
        return max(left, right) + 1;
    }
};