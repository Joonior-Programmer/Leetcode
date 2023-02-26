class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> contains = new HashSet<>();
        for (int i = 0; i < nums.length; ++i){
            if (contains.contains(nums[i])) return true;
            contains.add(nums[i]);
        }
        return false;
    }
}