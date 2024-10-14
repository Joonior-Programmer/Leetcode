class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);

        for (int num : nums) {
            maxHeap.offer(num);
        }

        long ret = 0;

        for (int i = 0; i < k; i++) {
            int maxValue = maxHeap.poll();
            ret += maxValue;
            maxHeap.offer((maxValue + 2) / 3);
        }

        return ret;
    }
}