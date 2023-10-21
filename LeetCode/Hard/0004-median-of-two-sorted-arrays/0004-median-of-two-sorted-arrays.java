class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length, m = nums2.length;
        
        if (n == 0) {
            if (m % 2 == 0) return (double)(nums2[m/2] + nums2[m/2-1]) / 2;
            return (double) nums2[m / 2];
        }
        
        if (m == 0) {
            if (n % 2 == 0) return (double)(nums1[n/2] + nums1[n/2-1]) / 2;
            return (double) nums1[n / 2];
        }
        
        int totalLen = n + m;
        int i = 0, j = 0, k = 0;
        int[] merged = new int[totalLen];
        
        while (i < n && j < m){
            if (nums1[i] < nums2[j]) merged[k++] = nums1[i++];
            else merged[k++] = nums2[j++];
        }
        
        while (i < n) merged[k++] = nums1[i++];
        while (j < m) merged[k++] = nums2[j++];
        
        if (totalLen % 2 == 0) return (double)(merged[totalLen / 2] + merged[totalLen / 2 - 1]) / 2;
        return (double) merged[totalLen / 2];
    }
}