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
    vector<double> averageOfLevels(TreeNode* root) {
        vector<double> ret;
        
        queue<TreeNode*> q;
        q.push(root);

        while (!q.empty()) {
            double temp = 0;
            int size = q.size();
            for (int i = 0; i < size; ++i){
                TreeNode* node = q.front();
                q.pop();
                temp += node->val;
                if (node->left) q.push(node->left);
                if (node->right) q.push(node->right);
            }
            ret.push_back(temp / size);
        }
        
        return ret;
    }
};