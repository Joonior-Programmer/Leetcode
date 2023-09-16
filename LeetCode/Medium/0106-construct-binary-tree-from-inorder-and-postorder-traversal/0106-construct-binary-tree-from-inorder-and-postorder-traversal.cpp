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
    int inorderIdx[6001];
    int idx;
    TreeNode* buildTree(vector<int>& inorder, vector<int>& postorder) {
        idx = postorder.size() - 1;
        
        for (int i = 0; i < idx+1; ++i) inorderIdx[inorder[i] + 3000] = i;
        
        return createTree(0, idx, postorder);
    }
    
    TreeNode* createTree(int left, int right, vector<int>& postorder){
        if (left > right) return nullptr;
        
        int nodeVal = postorder[idx--];
        TreeNode* node = new TreeNode(nodeVal);
        
        node->right = createTree(inorderIdx[nodeVal + 3000] + 1, right, postorder);
        node->left = createTree(left, inorderIdx[nodeVal + 3000] - 1, postorder);
        
        return node;
    }
};