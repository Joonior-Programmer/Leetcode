class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> ret = new ArrayList();
        
        for (int i = 0; i < nums.length; ++i)
            ret.add(index[i], nums[i]);
        
        int[] result = new int[ret.size()];
        
        for (int i = 0; i < ret.size(); i++)
            result[i] = ret.get(i);
        
        return result;
    }
}