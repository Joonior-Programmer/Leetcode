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
    vector<int> levelSum;
    
    Solution() { levelSum.resize(100000, 0); }
    TreeNode* replaceValueInTree(TreeNode* root) {
        ios::sync_with_stdio(false);
        cin.tie(nullptr);
        
        addDfs(root, 0);
        dfs(root, 0, root->val);
        
        return root;
    }
    
    void addDfs(TreeNode* node, int level){
        if (!node) return;
        
        levelSum[level] += node->val;
        
        addDfs(node->left, level + 1);
        addDfs(node->right, level + 1);
    }
    
    void dfs(TreeNode* node, int level, int childrenSum){
        if (!node) return;
        
        node->val = levelSum[level] - childrenSum;
        
        int nextSum = 0;
        if (node->left) nextSum += node->left->val;
        if (node->right) nextSum += node->right->val;
        
        dfs(node->left, level + 1, nextSum);
        dfs(node->right, level + 1, nextSum);
    }
};