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
    long long kthLargestLevelSum(TreeNode* root, int k) {
        ios::sync_with_stdio(false);
        cin.tie(nullptr);
        
        if (!root) return -1;

        priority_queue<long, vector<long>, greater<long>> ret;
        queue<TreeNode*> q;
        q.push(root);

        while (!q.empty()) {
            long tempRet = 0;
            int size = q.size();

            for (int i = 0; i < size; i++) {
                TreeNode* v = q.front();
                q.pop();
                tempRet += v->val;

                if (v->left) q.push(v->left);
                if (v->right) q.push(v->right);
            }

            ret.push(tempRet);
            if (ret.size() > k) ret.pop();
        }

        return ret.size() < k ? -1 : ret.top(); 
    }
};