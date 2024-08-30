class Solution {
public:
    vector<int> findIntersectionValues(vector<int>& nums1, vector<int>& nums2) {
        vector<int> count1(101);
        vector<int> count2(101);

        int ret1 = 0;
        int ret2 = 0;

        for (int v : nums1)  count1[v]++; 
        for (int v : nums2)  count2[v]++;

        for (int i = 1; i < 101; i++) 
            if (count2[i] > 0) ret1 += count1[i];
        
        for (int i = 1; i < 101; i++) 
            if (count1[i] > 0) ret2 += count2[i];

        return vector<int>{ret1, ret2};
    }
};