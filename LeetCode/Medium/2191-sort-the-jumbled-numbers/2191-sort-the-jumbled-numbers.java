class Solution {
    public int[] sortJumbled(int[] mapping, int[] nums) {
        int n = nums.length;
        int[][] order = new int[n][2];
        int[] ret = new int[n];

        for (int i = 0; i < n; ++i) order[i][1] = i;

        for (int i = 0; i < n; ++i){
            int temp = nums[i];
            int place = 1;
            int val = 0;

            if (temp == 0) val = mapping[0];

            while (temp > 0){
                val = mapping[temp % 10] * place + val;
                place *= 10;
                temp /= 10;
            }

            order[i][0] = val;
        }

        Arrays.sort(order, (a, b) -> {
            if (a[0] != b[0]) return Integer.compare(a[0], b[0]);
            else return Integer.compare(a[1], b[1]);
        });

        for (int i = 0; i < n; ++i) ret[i] = nums[order[i][1]];

        return ret;
    }
}