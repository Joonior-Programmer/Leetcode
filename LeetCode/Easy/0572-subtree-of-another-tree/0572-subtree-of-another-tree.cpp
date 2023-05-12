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
    bool ret = false;
    bool isSubtree(TreeNode* root, TreeNode* subRoot) {
        DFS(root, subRoot);
        return ret;
    }
    
    void DFS(TreeNode* node, TreeNode* subNode) {
        if (!node || ret) return;

        if (node->val == subNode->val && !ret) {
            ret = ret || isSameTree(node, subNode);
            if (ret) return;
        }

        DFS(node->left, subNode);
        DFS(node->right, subNode);
    }
    
    bool isSameTree(TreeNode* node, TreeNode* subNode){
        if (!node && !subNode) return true;
        else if (!node || !subNode) return false;
        
        return node->val == subNode->val && isSameTree(node->left, subNode->left) && isSameTree(node->right, subNode->right);
    }
};