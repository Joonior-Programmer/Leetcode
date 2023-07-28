class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ret = new ArrayList();
        
        if (nums.length == 1) {
            List<Integer> temp = new ArrayList();
            temp.add(nums[0]);
            ret.add(temp);
            return ret;
        }
        
        for (int i = 0; i < nums.length; ++i){
            List<List<Integer>> perms = permute(deleteIndex(nums, i));
            
            for (int j = 0; j < perms.size(); ++j){
                perms.get(j).add(nums[i]);
                ret.add(perms.get(j));
            }
        }
        
        return ret;
    }
    
    private int[] deleteIndex(int[] arr, int idx){
        int[] ret = new int[arr.length-1];
        int j = 0;
        
        for (int i = 0; i < arr.length; ++i){
            if (i != idx) ret[j++] = arr[i];
        }
        
        return ret;
    }
}