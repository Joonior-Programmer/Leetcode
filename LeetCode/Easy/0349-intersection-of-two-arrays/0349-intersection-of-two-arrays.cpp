
#include<hash_map>

class Solution {
public:
    vector<int> intersection(vector<int>& nums1, vector<int>& nums2) {
        vector<int> ret;
        __gnu_cxx::hash_map<int, bool> a;

        for (int i = 0; i < nums1.size(); ++i) a[nums1[i]] = true;
        
        for (int i = 0; i < nums2.size(); ++i){
            if (a[nums2[i]]) {
                ret.push_back(nums2[i]);
                a[nums2[i]] = false;
            }
        }
        
        return ret;
    }
};