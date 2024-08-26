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
    vector<bool> exist;
    int k;
    
    bool findTarget(TreeNode* root, int k) {
        exist.resize(20001);
        this->k = k;
        
        return dfs(root);
    }
    
    bool dfs(TreeNode* node){
        if (!node) return false;

        if (abs(k - node->val) < 10000)
            if (exist[k - node->val + 10000])
                return true;

        exist[node->val + 10000] = true;

        if (dfs(node->left)) return true;
        if (dfs(node->right)) return true;
        
        return false;
    }
};