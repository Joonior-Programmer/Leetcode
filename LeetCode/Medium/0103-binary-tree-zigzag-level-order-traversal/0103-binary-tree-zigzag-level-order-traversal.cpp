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
    vector<vector<int>> zigzagLevelOrder(TreeNode* root) {
        vector<vector<int>> ret;
        if (!root){
            return ret;
        }
        vector<TreeNode*> prev{root};
        bool isLeft = true;
        while (!prev.empty()){
            vector<int> temp;
            vector<TreeNode*> tempPrev;
            for(int i = 0; i < prev.size(); ++i){
                temp.push_back(prev[i]->val);
                if (prev[i]->left){
                    tempPrev.push_back(prev[i]->left);
                }
                if (prev[i]->right){
                    tempPrev.push_back(prev[i]->right);
                }
            }
            if (!isLeft){
                reverse(temp.begin(), temp.end());
            }
            ret.push_back(temp);
            prev = tempPrev;
            isLeft = !isLeft;
        }
        return ret;
    }
};