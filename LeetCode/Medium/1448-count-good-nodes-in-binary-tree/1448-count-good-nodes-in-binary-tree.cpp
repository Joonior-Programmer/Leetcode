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

const static auto fast = [] {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);
    return 0;
}(); 

class Solution {
public:
    int goodNodes(TreeNode* root) {
        return DFS(root, root->val);
    }
    
    int DFS(TreeNode* node, int maxVal){
        if (!node) return 0;
        
        maxVal = max(maxVal, node->val);
        
        return DFS(node->left, maxVal) + 
                DFS(node->right, maxVal) + 
                (node->val >= maxVal);
    }
};