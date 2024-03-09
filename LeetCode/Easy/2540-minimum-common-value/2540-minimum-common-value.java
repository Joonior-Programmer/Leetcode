class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int l1 = 0;
        int l2 = 0;
        int n = nums1.length;
        int m = nums2.length;
        
        if (nums1[n-1] < nums2[0] || nums2[m-1] < nums1[0]) return -1;
        
        while (l1 < n && l2 < m){
            int temp1 = nums1[l1];
            int temp2 = nums2[l2];
            
            if (temp1 == temp2) return temp1;
            else if (temp1 < temp2) ++l1;
            else ++l2;
        }
        
        return -1;
    }
}