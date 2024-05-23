class Solution {
    int ret = 0;
    int n;
    int k;
    int[] count;
    int[] nums;
    
    public int beautifulSubsets(int[] nums, int k) {
        n = nums.length;
        count = new int[1001];
        this.nums = nums;
        this.k = k;
        dfs(0);

        return ret;
    }
    
    public void dfs(int idx){
        if (idx == n) return;

        int temp = nums[idx];

        if ((temp - k < 0 || count[temp - k] == 0) && (
            temp + k > 1000 || count[temp + k] == 0)){
            ++ret;
            ++count[temp];

            dfs(idx + 1);
            count[temp]--;
            dfs(idx + 1);
        } else dfs(idx + 1);
    }
}