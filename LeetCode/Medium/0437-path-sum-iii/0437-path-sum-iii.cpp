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
    unordered_map<long, int> lookup;
    int targetSum;
    
    int pathSum(TreeNode* root, int targetSum) {
        this->targetSum = targetSum;
        lookup[0] = 1;    
        return DFS(root, 0);
    }
    
    int DFS(TreeNode* node, long currSum){
        int count = 0;
        
        if (node) {
            currSum += node->val;
            if (lookup.find(currSum - targetSum) != lookup.end()) 
                count = lookup[currSum - targetSum];
            
            if (lookup.find(currSum) == lookup.end()) lookup[currSum] = 1;
            else ++lookup[currSum];
            
            count += DFS(node->left, currSum) + DFS(node->right, currSum);
            
            lookup[currSum]--;
            
        }
        
        return count;
    }
};