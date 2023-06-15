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
    int sum[10001];
    int maxLevel = 1;
    
    int maxLevelSum(TreeNode* root) {
        DFS(root, 1);
        
        int ret = 1;
        int maxSum = sum[1];
        
        for (int i = 2; i < maxLevel+1; ++i){
            if (sum[i] > maxSum) {
                maxSum = sum[i];
                ret = i;
            }
        }
        return ret;
    }
    
    void DFS(TreeNode* node, int level){
        if (!node) return;
        if (level > maxLevel) maxLevel = level;
        sum[level] += node->val;
        DFS(node->left, level+1);
        DFS(node->right, level+1);
    }
};