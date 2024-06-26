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
    vector<TreeNode*> arr;
    
    TreeNode* balanceBST(TreeNode* root) {
        inorder(root);
        
        return make(0, arr.size()-1);
    }
    
    void inorder(TreeNode* node){
        if (!node) return;
        
        inorder(node->left);
        arr.push_back(node);
        inorder(node->right);
    }
    
    TreeNode* make(int l, int r){
        if (l > r) return nullptr;
        
        int mid = (l + r) / 2;
        
        TreeNode* curr = arr[mid];
        curr->left = make(l, mid-1);
        curr->right = make(mid + 1, r);
        
        return curr;
    }
};