class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        boolean[] count = new boolean[101];
        int ret = 0;
        
        for (List<Integer> v : nums){
            for (int i = v.get(0); i < v.get(1) + 1; i++)
                if (!count[i]){
                    ++ret;
                    count[i] = true;
                }
        }
        
        return ret;
    }
}