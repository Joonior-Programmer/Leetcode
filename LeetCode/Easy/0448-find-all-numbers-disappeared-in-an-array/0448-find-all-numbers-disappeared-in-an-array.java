class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> exist = new HashSet<>();
        ArrayList<Integer> ret = new ArrayList<>();
        for (int i = 0; i < nums.length; ++i){
            exist.add(nums[i]);
        }
        
        for (int i = 1; i < nums.length + 1; ++i){
            if(!exist.contains(i)) ret.add(i);
        }
        
        
        return ret;
    }
}