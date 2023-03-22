class Solution {
public:
    vector<int> intersect(vector<int>& nums1, vector<int>& nums2) {
        sort(nums1.begin(), nums1.end());
        sort(nums2.begin(), nums2.end());
        
        int i = nums1.size() - 1;
        int j = nums2.size() - 1;
        
        vector<int> ret;
        
        while(i > -1 && j > -1){
            if (nums1[i] == nums2[j]) {
                ret.push_back(nums1[i]);
                i--;
                j--;
            } else if (nums1[i] > nums2[j]) i--;
            else j--;
        }
        return ret;
    }
};