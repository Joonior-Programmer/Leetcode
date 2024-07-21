class Solution {
    public List<Integer> lastVisitedIntegers(int[] nums) {
        LinkedList<Integer> seen = new LinkedList();
        List<Integer> ret = new ArrayList();
        int k = 0;
        
        for (int v : nums){
            if (v != -1){
                seen.addFirst(v);
                k = 0;
            } else {
                ++k;
                
                if (k > seen.size()) ret.add(-1);
                else ret.add(seen.get(k-1));
            }
        }
        
        return ret;
    }
}