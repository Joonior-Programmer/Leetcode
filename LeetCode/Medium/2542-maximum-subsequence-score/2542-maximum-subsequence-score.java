class Solution {
    public long maxScore(int[] nums1, int[] nums2, int k) {
        int n = nums2.length;
        Integer[] idxs = new Integer[n];
        long n1Sum = 0;
        
        for (int i = 0; i < n; ++i) idxs[i] = i;
        
        Arrays.sort(idxs, new Comparator<Integer>() {
            @Override
            public int compare(Integer i1, Integer i2) {
                return nums2[i2] - nums2[i1];
            }
        });
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for (int i = 0; i < k; ++i) {
            pq.offer(nums1[idxs[i]]);
            n1Sum += nums1[idxs[i]];
        }
        
        long ret = n1Sum * nums2[idxs[k-1]];
        
        for (int i = k; i < n; ++i){
            n1Sum += nums1[idxs[i]] - pq.poll();
            pq.offer(nums1[idxs[i]]);
            ret = Math.max(ret, n1Sum * nums2[idxs[i]]);
        }
        
        return ret;
    }
}