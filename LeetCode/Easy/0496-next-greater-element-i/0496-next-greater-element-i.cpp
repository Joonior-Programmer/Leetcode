class Solution {
public:
    vector<int> nextGreaterElement(vector<int>& nums1, vector<int>& nums2) {
        int findBig[10000]{[0 ... 9999] = -1};
        stack<int> stack;
        vector<int> ret;

        for (int i = 0; i < nums2.size(); ++i){
            while(!stack.empty() && stack.top() < nums2[i]){
                int key = stack.top();
                findBig[key] = nums2[i];
                stack.pop();
            }
            stack.push(nums2[i]);
        }
        
        for (int i = 0; i < nums1.size(); ++i) ret.push_back(findBig[nums1[i]]);
        
        return ret;
    }
};