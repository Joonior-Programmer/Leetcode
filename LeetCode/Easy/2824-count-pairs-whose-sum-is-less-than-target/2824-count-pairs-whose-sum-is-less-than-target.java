class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int n = nums.size();
        int ret = 0;
        
        for (int i = 0; i < n; ++i){
            int temp = nums.get(i);
            
            for (int j = i + 1; j < n; ++j)
                if (temp + nums.get(j) < target) ++ret;
        }
        
        return ret;
    }
}