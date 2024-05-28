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
            curr += diff[r++];
            
            if (curr > maxCost) curr -= diff[l++];

            ret = Math.max(ret, r - l);
        }
        
        return ret;
    }
}