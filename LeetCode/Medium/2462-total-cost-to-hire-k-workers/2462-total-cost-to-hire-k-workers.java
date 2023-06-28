class Solution {
    public long totalCost(int[] costs, int k, int candidates) {
        long ret = 0;
        int n = costs.length;
        if (n <= candidates * 2){
            Arrays.sort(costs);
            for (int i = 0; i < k; ++i) ret += costs[i];
            return ret;
        }

        int l = candidates;
        int r = n - candidates;

        PriorityQueue<Long> lPQ = new PriorityQueue();
        PriorityQueue<Long> rPQ = new PriorityQueue();

        for (int i = 0; i < l; ++i) lPQ.offer((long)costs[i]);
        for (int i = r; i < n; ++i ) rPQ.offer((long)costs[i]);

        while (k > 0) {
            long lVal = lPQ.peek();
            long rVal = rPQ.peek();
            
            if (rVal < lVal){
                ret += rPQ.poll();
                rPQ.offer((long)costs[--r]);
            } else {
                ret += lPQ.poll();
                lPQ.offer((long)costs[l++]);
            }
            k--;
            if (l >= r){
                while (!rPQ.isEmpty()) lPQ.offer(rPQ.poll());
                    while (k > 0) {
                        ret += lPQ.poll();
                        k--;
                    }
            }
        }
        
        return ret;
    }
}