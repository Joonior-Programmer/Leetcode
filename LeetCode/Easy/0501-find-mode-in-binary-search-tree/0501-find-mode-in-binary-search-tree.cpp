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
    unordered_map<int, int> count;
    vector<int> findMode(TreeNode* root) {
        DFS(root);
        int max_val = 0;
        vector<int> ret;

        for(auto elem: count){
            if (elem.second > max_val) {
                ret.clear();
                ret.push_back(elem.first);
                max_val = elem.second;
            } else if (elem.second == max_val) ret.push_back(elem.first);
        }
        return ret;
    }

    void DFS(TreeNode* node){
        if (!node) return;
        if (count.find(node->val) == count.end()){
            count[node->val] = 1;
        } else ++count[node->val];
        DFS(node->left);
        DFS(node->right);
    }
};