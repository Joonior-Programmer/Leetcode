class Solution {
    public int findNumbers(int[] nums) {
        int ret = 0;

        for (int num : nums){
            int temp = num;
            int digits = 0;
            
            while (temp > 0){
                temp /= 10;
                ++digits;
            }

            if (digits % 2 == 0) ++ret;
        }

        return ret;
    }
}