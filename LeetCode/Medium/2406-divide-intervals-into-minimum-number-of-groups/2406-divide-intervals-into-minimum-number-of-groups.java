class Solution {
    public int minGroups(int[][] intervals) {
        PriorityQueue<Integer> pq = new PriorityQueue();
        
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        
        for (int[] v : intervals){
            if (!pq.isEmpty() && pq.peek() < v[0]) pq.poll();
            pq.offer(v[1]);
        }
        
        return pq.size();
    }
}