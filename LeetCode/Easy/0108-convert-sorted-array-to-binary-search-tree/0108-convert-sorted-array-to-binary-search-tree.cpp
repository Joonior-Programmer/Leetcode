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
    TreeNode* sortedArrayToBST(vector<int>& nums) {
        if (nums.empty()) return nullptr;
        
        int mid = nums.size() / 2;
        TreeNode* node = new TreeNode(nums[mid]);

        vector<int> leftSubVector = createSubVector(nums, 0, mid);
        vector<int> rightSubVector = createSubVector(nums, mid+1, nums.size());

        node->left = sortedArrayToBST(leftSubVector);
        node->right = sortedArrayToBST(rightSubVector);
        
        return node;
    }
    
    vector<int>& createSubVector(vector<int>& nums, int start, int end){
        vector<int>* subVector = new vector<int>;
        for (int i = start; i < end; ++i){
            subVector->push_back(nums[i]);
        }
        return *subVector;
    }
};