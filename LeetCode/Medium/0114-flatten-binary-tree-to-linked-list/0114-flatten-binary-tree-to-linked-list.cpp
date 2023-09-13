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
    TreeNode* dummy;
    void flatten(TreeNode* root) {
        dummy = new TreeNode();
        
        postOrder(root);
    }
    
    void postOrder(TreeNode* node){
        if (!node) return;
        
        postOrder(node->right);
        postOrder(node->left);
        node->right = dummy->right;
        node->left = nullptr;
        dummy->right = node;
    }
};