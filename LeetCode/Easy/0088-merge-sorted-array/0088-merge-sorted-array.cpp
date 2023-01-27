class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        m--;
        n--;
        for (int i = m + n + 1; i > -1; i--){
            if (n < 0) return;
            if (m > -1 && nums1[m] > nums2[n]){
                nums1[i] = nums1[m];
                m--;
            } else {
                nums1[i] = nums2[n];
                n--;
            }
        }
    }
};