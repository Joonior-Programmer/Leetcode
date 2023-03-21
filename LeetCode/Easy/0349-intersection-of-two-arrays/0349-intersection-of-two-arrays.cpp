class Solution {
public:
    vector<int> intersection(vector<int>& nums1, vector<int>& nums2) {
        vector<int> ret;
        unordered_set<int> a;
        unordered_set<int> b;
        for (int i = 0; i < nums1.size(); ++i) a.insert(nums1[i]);
        for (int i = 0; i < nums2.size(); ++i) b.insert(nums2[i]);
        
        for (auto v = a.begin(); v != a.end(); ++v){
            if (b.find((*v)) != b.end()) ret.push_back((*v));
        }
        
        return ret;
    }
};