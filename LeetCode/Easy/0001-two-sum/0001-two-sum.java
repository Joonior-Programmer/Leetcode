class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; ++i){
            int need = target - nums[i];
            if (map.containsKey(need)){
                result[0] = map.get(need);
                result[1] = i;
                break;
            }
            map.put(nums[i], i);
        }
        return result;
    }
}