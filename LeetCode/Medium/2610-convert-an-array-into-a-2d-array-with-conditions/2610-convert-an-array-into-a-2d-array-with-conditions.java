class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        int[] count = new int[201];
        List<List<Integer>> ret = new ArrayList();
        
        for (int num : nums) {
            if (count[num] == ret.size()) ret.add(new ArrayList());
            ret.get(count[num]).add(num);
            ++count[num];
        }
        
        return ret;
    }
}