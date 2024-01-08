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
    int rangeSumBST(TreeNode* root, int low, int high) {
        if (!root) return 0;

        int ret = 0;
        int val = root->val;
        
        if (val >= low && val <= high) ret += val;

        if (val < high) ret += rangeSumBST(root->right, low, high);
        if (val > low) ret += rangeSumBST(root->left, low, high);
        
        return ret;
    }
};