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
    TreeNode* createBinaryTree(vector<vector<int>>& descriptions) {
        vector<TreeNode*> nodes(100001);
        unordered_set<int> child;
        int ret = 0;

        for (const auto& v : descriptions) {
            int p = v[0];
            int c = v[1];

            if (!nodes[p]) nodes[p] = new TreeNode(p);
            if (!nodes[c]) nodes[c] = new TreeNode(c);

            child.insert(c);

            if (v[2] == 1) nodes[p]->left = nodes[c];
            else nodes[p]->right = nodes[c];
        }

        for (const auto& v : descriptions) {
            if (child.find(v[0]) == child.end()) {
                ret = v[0];
                break;
            }
        }

        return nodes[ret];
    }
};