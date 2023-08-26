class Solution {
    public String minWindow(String s, String t) {
        int[] count = new int[128];
        int needCount = t.length();
        int start = 0, end = Integer.MAX_VALUE;
        int l = 0;
        char[] sCharArray = s.toCharArray();
        char[] tCharArray = t.toCharArray();
        
        for (int i = 0; i < tCharArray.length; ++i) ++count[tCharArray[i]];
        
        for (int r = 0; r < sCharArray.length; ++r){
            if (count[sCharArray[r]] > 0) needCount--;
            
            count[sCharArray[r]]--;
            
            if (needCount == 0){
                while (count[sCharArray[l]] != 0) ++count[sCharArray[l++]];
                
                if (end - start > r - l) {
                    end = r;
                    start = l;
                }
                
                ++needCount;
                ++count[sCharArray[l++]];
            }
        }
        
        if (end == Integer.MAX_VALUE) return "";
        
        return s.substring(start, end+1);
    }
}