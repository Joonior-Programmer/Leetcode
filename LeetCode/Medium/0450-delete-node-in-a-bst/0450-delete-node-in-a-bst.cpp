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
    TreeNode* deleteNode(TreeNode* root, int key) {
        if (!root) return root;
        TreeNode* head = new TreeNode();
        TreeNode* prev = head;
        TreeNode* curr = root;
        head->left = root;
        bool isLeft = true;
        
        while (curr && curr->val != key){
            prev = curr;
            if (curr->val > key){
                isLeft = true;
                curr = curr->left;
            } else {
                isLeft = false;
                curr = curr->right;
            }
        }
        
        if (!curr) return root;

        if (!curr->right){
            if (isLeft) prev->left = curr->left;
            else prev->right = curr->left;
        } else {
            TreeNode* temp = curr->right;
            
            while (temp->left) temp = temp->left;
            temp->left = curr->left;

            if (isLeft) prev->left = curr->right;
            else prev->right = curr->right;
        }

        return head->left;
    }
};