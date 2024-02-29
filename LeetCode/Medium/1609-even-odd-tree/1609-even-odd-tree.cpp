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
    bool isEvenOddTree(TreeNode* root) {
        if (root == nullptr || root->val % 2 == 0) {
            return false;
        }

        std::queue<TreeNode*> q;
        q.push(root);
        bool isOdd = true;

        while (!q.empty()) {
            int size = q.size();
            int prev = isOdd ? INT_MIN : INT_MAX;

            for (int i = 0; i < size; ++i) {
                TreeNode* curr = q.front();
                q.pop();

                if ((isOdd && (curr->val % 2 == 0 || curr->val <= prev)) ||
                    (!isOdd && (curr->val % 2 != 0 || curr->val >= prev))) {
                    return false;
                }

                if (curr->left != nullptr) {
                    q.push(curr->left);
                }
                if (curr->right != nullptr) {
                    q.push(curr->right);
                }

                prev = curr->val;
            }

            isOdd = !isOdd;
        }

        return true;
    }
};