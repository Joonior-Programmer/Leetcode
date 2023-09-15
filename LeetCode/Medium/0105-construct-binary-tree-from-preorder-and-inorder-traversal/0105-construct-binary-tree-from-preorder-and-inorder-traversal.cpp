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
    int inorderIdx[6001]{0};
    int idx = 0;
    
    TreeNode* buildTree(vector<int>& preorder, vector<int>& inorder) {
        for (int i = 0; i < preorder.size(); ++i) inorderIdx[inorder[i] + 3000] = i;
        
        return createTree(0, preorder.size()-1, preorder);
    }
    
    TreeNode* createTree(int left, int right, vector<int>& preorder){
        if (left > right) return nullptr;
        
        int nodeVal = preorder[idx++];
        TreeNode* node = new TreeNode(nodeVal);
        
        node->left = createTree(left, inorderIdx[nodeVal + 3000] - 1, preorder);
        node->right = createTree(inorderIdx[nodeVal + 3000] + 1, right, preorder);
        
        return node;
    }
};