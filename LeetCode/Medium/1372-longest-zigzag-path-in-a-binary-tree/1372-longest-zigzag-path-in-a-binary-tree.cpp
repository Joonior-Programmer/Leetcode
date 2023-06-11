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
        DFS(root, true, 0);
        DFS(root, false, 0);
        return ret - 1;
    }
    
    void DFS(TreeNode* node, bool is_left, int ret){
        if (!node) {
            this->ret = max(ret, this->ret);
            return;
        }
        DFS(node->left, !is_left, is_left ? ret + 1 : 0);
        DFS(node->right, !is_left, is_left ? 0 : ret + 1);
    }
};