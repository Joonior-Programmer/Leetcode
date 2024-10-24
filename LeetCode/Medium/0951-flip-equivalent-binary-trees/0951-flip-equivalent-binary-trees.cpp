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
    bool flipEquiv(TreeNode* root1, TreeNode* root2) {
        return dfs(root1, root2);
    }
    
    bool dfs(TreeNode* node1, TreeNode* node2){
        if (!node1 && !node2) return true;
        else if (!node1) return false;
        else if (!node2) return false;
        
        if (node1->val != node2->val) return false;
        
        int l1 = node1->left ? node1->left->val : -1;
        int l2 = node2->left ? node2->left->val : -1;
        int r1 = node1->right ? node1->right->val : -1;
        int r2 = node2->right ? node2->right->val : -1;
        
        if (l1 == l2) return dfs(node1->left, node2->left) && dfs(node1->right, node2->right);
        return dfs(node1->left, node2->right) && dfs(node1->right, node2->left);
    }
};