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
    int startValue;
    int destValue;
    
    string getDirections(TreeNode* root, int startValue, int destValue) {
        this->startValue = startValue;
        this->destValue = destValue;
        
        TreeNode* lcaNode = lca(root);
        string s, d;
        
        search(lcaNode, startValue, s);
        search(lcaNode, destValue, d);

        return string(s.length(), 'U') + d;
    }
    
private:
    TreeNode* lca(TreeNode* node) {
        if (node == nullptr) return nullptr;
        
        if (node->val == startValue || node->val == destValue) return node;
        
        TreeNode* l = lca(node->left);
        TreeNode* r = lca(node->right);
        
        if (l != nullptr && r != nullptr) return node;
        else if (l != nullptr) return l;
        else if (r != nullptr) return r;
        
        return nullptr;
    }
    
    bool search(TreeNode* node, int v, string& curr) {
        if (node == nullptr) return false;
        
        if (node->val == v) return true;
        
        curr.push_back('L');
        if (search(node->left, v, curr)) return true;
        curr.pop_back();
        
        curr.push_back('R');
        if (search(node->right, v, curr)) return true;
        curr.pop_back();
        
        return false;
    }
};