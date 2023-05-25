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
    bool leafSimilar(TreeNode* root1, TreeNode* root2) {
        vector<int> ret1;
        DFS(root1, ret1);
        vector<int> ret2;
        DFS(root2, ret2);

        if (ret1.size() != ret2.size()) return false;

        for (int i = 0; i < ret1.size(); ++i) {
            if (ret1[i] != ret2[i]) return false;
        }
        
        return true;
    }
    
    vector<int> DFS(TreeNode* node, vector<int>& ret){
        if (!node) return ret;
        if (!node->left && !node->right) ret.push_back(node->val);
        DFS(node->left, ret);
        DFS(node->right, ret);
        return ret;
    }
};