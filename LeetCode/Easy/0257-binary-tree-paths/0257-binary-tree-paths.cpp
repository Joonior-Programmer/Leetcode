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
    vector<string> binaryTreePaths(TreeNode* root) {
        vector<string> ret;
        string s;
        inOrder(root, s, ret);
        return ret;
    }
    
    void inOrder(TreeNode* node, string s, vector<string>& ret){
        s += to_string(node->val);
        if (!node->left && !node->right){
            ret.push_back(s);
        }

        if (node->left) inOrder(node->left, s + "->", ret);
        if (node->right) inOrder(node->right, s + "->", ret);
    }
};