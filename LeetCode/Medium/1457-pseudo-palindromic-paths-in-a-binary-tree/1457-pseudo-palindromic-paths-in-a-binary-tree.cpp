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
    int pseudoPalindromicPaths (TreeNode* root) {
        vector<int> count(10);
        return dfs(root, count);
    }

    int dfs (TreeNode* node, vector<int>& count){
        ++count[node->val];
        
        if (!node->left && !node->right){
            bool isOddExist = false;
            
            for (int i = 1; i < 10; ++i){
                if (count[i] % 2 == 1){
                    if (isOddExist) {
                        count[node->val]--;
                        return 0;
                    }
                    isOddExist = true;
                }
            }

            count[node->val]--;
            
            return 1;
        }
        
        int ret = 0;
        
        if (node->left) ret += dfs(node->left, count);
        if (node->right) ret += dfs(node->right, count);
        
        count[node->val]--;
        
        return ret;
    }
};