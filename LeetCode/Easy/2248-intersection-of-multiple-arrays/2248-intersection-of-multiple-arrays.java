class Solution {
    public List<Integer> intersection(int[][] nums) {
        List<Integer> ret = new ArrayList();
        int n = nums.length;
        int[] count = new int[1001];

        for (int[] num : nums)
            for (int v : num) ++count[v];

        for (int i = 1; i < 1001; ++i)
            if (count[i] == n) ret.add(i);   

        return ret;
    }
}