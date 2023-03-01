class Solution {
    public List<String> summaryRanges(int[] nums) {
        int len = nums.length;
        int i = 0;
        ArrayList<String> ret = new ArrayList<>();
        while (i < len){
            int low = i;

            while (i + 1 < len && nums[i+1] == nums[i]+1){
                ++i;
            }
             
            StringBuffer buf = new StringBuffer(Integer.toString(nums[low]));
            if (low != i) {
                buf.append("->");
                buf.append(Integer.toString(nums[i]));
            }
            ret.add(buf.toString());
            ++i;
        }
        return ret;
    }
}