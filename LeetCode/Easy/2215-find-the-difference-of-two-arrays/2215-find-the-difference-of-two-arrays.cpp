class Solution {
public:
    vector<vector<int>> findDifference(vector<int>& nums1, vector<int>& nums2) {
        unordered_set<int> isExist1;
        unordered_set<int> isExist2;
        
        for (int i = 0; i < nums1.size(); ++i) isExist1.insert(nums1[i]);
        for (int i = 0; i < nums2.size(); ++i) isExist2.insert(nums2[i]);
        
        vector<vector<int>> ret;
        vector<int> first;
        vector<int> second;
        
        for (int v : isExist1){
            if (isExist2.find(v) == isExist2.end()) first.push_back(v);
        }
        
        for (int v : isExist2){
            if (isExist1.find(v) == isExist1.end()) second.push_back(v);
        }
        
        ret.push_back(first);
        ret.push_back(second);
        
        return ret;
    }
};