class Solution {
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int n = nums1.length;
        int m = nums2.length;
        int ret = 0;
        
        for (int v0 : nums1)
            for (int v1 : nums2)
                if (v0 % (v1 * k) == 0)
                    ++ret;
        
        return ret;
    }
}