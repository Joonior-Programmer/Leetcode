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
    unordered_set<int> exist;
    int first;
    int second;

    int findSecondMinimumValue(TreeNode* root) {
        first = INT_MAX;
        second = INT_MAX;
        
        dfs(root);
        
        if (exist.size() == 1) return -1;
        
        return second;
    }
    
    void dfs(TreeNode* node) {
        if (!node) return;
        
        if (exist.find(node->val) == exist.end()) {
            if (node->val < first) {
                second = first;
                first = node->val;
            } else if (node->val < second) {
                second = node->val;
            }
            exist.insert(node->val);
        }
        
        dfs(node->left);
        dfs(node->right);
    }
};