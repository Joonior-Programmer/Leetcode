class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        PriorityQueue<Integer[]> pq = new PriorityQueue<>((o1, o2) -> {
            return Integer.compare(o1[0], o2[0]);
        });

        List<List<Integer>> ret = new ArrayList();

        for (int i = 0; i < k && i < nums1.length; ++i) pq.offer(new Integer[]{nums1[i] + nums2[0], i, 0});
        
        while (k > 0 && !pq.isEmpty()){
            Integer[] target = pq.poll();
            
            int i = target[1];
            int j = target[2];

            ret.add(Arrays.asList(nums1[i], nums2[j]));
            
            if (j + 1 < nums2.length)
                pq.offer(new Integer[]{nums1[i] + nums2[j+1], i, j+1});
            

            k--;
        }

        return ret;

    }
}