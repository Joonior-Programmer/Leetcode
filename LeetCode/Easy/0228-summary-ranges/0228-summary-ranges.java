class Solution {
    public List<String> summaryRanges(int[] nums) {
        int len = nums.length;
        ArrayList<String> ret = new ArrayList<>();

        if (len == 0) return ret;
        else if (len == 1) {
            ret.add(String.valueOf(nums[0])); 
            return ret;
        }

        int min = nums[0];
        int max = nums[1];

        if (min + 1 != max) {
            ret.add(String.valueOf(min));
            min = max;
        }
        
        for (int i = 2; i < len; ++i){
            if (nums[i] == max + 1) ++max;
            else if (min == max) {
                ret.add(String.valueOf(min));
                min = nums[i];
                max = nums[i];
            } else {
                ret.add(String.valueOf(min)+"->"+String.valueOf(max));
                min = nums[i];
                max = nums[i];
            }
        }
        
        if (min == max){
            ret.add(String.valueOf(min));
        } else {
            ret.add(String.valueOf(min)+"->"+String.valueOf(max));
        }

        return ret;
    }
}