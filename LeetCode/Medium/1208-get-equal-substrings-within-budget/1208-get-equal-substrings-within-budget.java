class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int n = s.length();
        int[] diff = new int[n];
        int ret = 0;

        char[] sCharArray = s.toCharArray();
        char[] tCharArray = t.toCharArray();
        
        int l = 0, r = 0, curr = 0;

        for (int i = 0; i < n; ++i) diff[i] = Math.abs(sCharArray[i] - tCharArray[i]);
        
        while (r < n){
            if (curr + diff[r] <= maxCost){
                curr += diff[r];
                ++r;
                ret = Math.max(ret, r - l);
            } else {
                curr -= diff[l];
                ++l;
            }
        }
        
        return ret;
    }
}