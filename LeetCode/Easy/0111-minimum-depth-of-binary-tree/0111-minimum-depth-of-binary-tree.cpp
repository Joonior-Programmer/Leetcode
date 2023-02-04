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
    int minDepth(TreeNode* root) {
        return DFS(root, 1);
    }
    
    int DFS(TreeNode* node, int depth){
        if (!node) return depth - 1;
        
        int left = DFS(node->left, depth + 1);
        int right = DFS(node->right, depth + 1);
        
        if (left == depth) return right;
        else if (right == depth) return left;
        
        return min(left, right);
    }
};