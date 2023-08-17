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
    string ret = "";
    string tree2str(TreeNode* root) {
        preOrder(root);
        return ret;
    }
    
    void preOrder(TreeNode* node){
        if (!node) return;
        
        ret += to_string(node->val);
        
        if (node->left){
            ret += "(";
            preOrder(node->left);
            ret += ")";
        } else if (node->right){
            ret += "()(";
            preOrder(node->right);
            ret += ")";
        }
        
        if (node->left && node->right){
            ret += "(";
            preOrder(node->right);
            ret += ")";
        }
    }
};