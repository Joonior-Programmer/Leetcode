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
    int val;
    int depth;
        
    TreeNode* addOneRow(TreeNode* root, int val, int depth) {
        if (depth == 1) return new TreeNode(val, root, nullptr);
        
        this->val = val;
        this->depth = depth;
        
        dfs(root, 2);
        
        return root;
    }
    
    void dfs(TreeNode* node, int curr){
        if (!node) return;
        
        if (curr == depth){
            TreeNode* l = node->left;
            TreeNode* r = node->right;
            TreeNode* newL = new TreeNode(val, l, nullptr);
            TreeNode* newR = new TreeNode(val, nullptr, r);
            node->left = newL;
            node->right = newR;
            return;
        } else {
            dfs(node->left, curr + 1);
            dfs(node->right, curr + 1);
        }
    }
};