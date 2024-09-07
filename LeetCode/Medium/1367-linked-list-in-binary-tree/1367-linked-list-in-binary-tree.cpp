/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
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
    bool isSubPath(ListNode* head, TreeNode* root) {
        return createDfs(head, root);
    }
    
    bool dfs(ListNode* listNode, TreeNode* treeNode){
        if (!listNode) return true;
        if (!treeNode) return false;
        
        if (listNode->val == treeNode->val) return dfs(listNode->next, treeNode->left) || dfs(listNode->next, treeNode->right);
        
        return false;
    }
    
     bool createDfs(ListNode* listNode, TreeNode* treeNode){
        if (!treeNode) return false;
        
        if (dfs(listNode, treeNode)) return true;
        
        return createDfs(listNode, treeNode->left) || createDfs(listNode, treeNode->right);
    }
};