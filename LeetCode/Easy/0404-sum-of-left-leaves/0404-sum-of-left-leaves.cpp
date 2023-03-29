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
    int sumOfLeftLeaves(TreeNode* root) {
        if (!root) return 0;
        
        int temp = 0;
        
        if (root->left && !root->left->left && !root->left->right){
            temp += root->left->val;
            temp += sumOfLeftLeaves(root->right);
        } else {
            temp += sumOfLeftLeaves(root->left);
            temp += sumOfLeftLeaves(root->right);
        }
        return temp;
    }
};