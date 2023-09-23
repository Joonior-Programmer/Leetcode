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
    bool isValidBST(TreeNode* root) {
        return validate(root, LONG_MAX, LONG_MIN);
    }
    
    bool validate(TreeNode* node, long minVal, long maxVal){
        if (!node) return true;
        if (minVal <= node->val || maxVal >= node->val) return false;
        
        return validate(node->left, node->val, maxVal) && validate(node->right, minVal, node->val);
    }
};