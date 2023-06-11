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
    int longestZigZag(TreeNode* root) {
        DFS(root, 0, 0);
        return ret;
    }
    
    void DFS(TreeNode* node, int left, int right){
        if (!node) return;
        
        ret = max(ret, max(left, right));
        
        DFS(node->left, right+1, 0);
        DFS(node->right, 0, left+1);
    }
};