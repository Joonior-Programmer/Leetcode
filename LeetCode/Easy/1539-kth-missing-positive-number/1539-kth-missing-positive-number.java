class Solution {
    public int findKthPositive(int[] arr, int k) {
        int i = 0;
        int min_num = 1;
        for (int v : arr){
            if (v != min_num){
                if (v - min_num >= k - i) return min_num + k - i - 1;
                else {
                    i += v - min_num;
                    min_num = v + 1;
                }
            }
            else min_num += 1;
        }
        return min_num + k - i - 1;
    }
}