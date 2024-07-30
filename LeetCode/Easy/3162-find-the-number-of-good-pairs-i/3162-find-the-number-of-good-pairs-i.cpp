class Solution {
public:
    int numberOfPairs(vector<int>& nums1, vector<int>& nums2, int k) {
        int n = nums1.size();
        int m = nums2.size();
        int ret = 0;
        
        for (int v0 : nums1)
            for (int v1 : nums2)
                if (v0 % (v1 * k) == 0)
                    ++ret;
        
        return ret;
    }
};