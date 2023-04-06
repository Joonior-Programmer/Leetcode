class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        boolean[] exist = new boolean[nums.length + 1];
        ArrayList<Integer> ret = new ArrayList<>();
        for (int i = 0; i < nums.length; ++i){
            exist[nums[i]] = true;
        }
        
        for (int i = 1; i < nums.length + 1; ++i){
            if(!exist[i]) ret.add(i);
        }
        
        
        return ret;
    }
}