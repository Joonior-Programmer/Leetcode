class Solution {
    public int minimumLength(String s) {
        int l = 0;
        int r = s.length() - 1;
        char[] sCharArray = s.toCharArray();
        
        while (l < r){
            if (sCharArray[l] == sCharArray[r]){
                char temp = sCharArray[l++];
                
                while (l <= r && sCharArray[l] == temp) ++l;
                while (l <= r && sCharArray[r] == temp) r--;
            } else break;
        }
        
        return Math.max(0, r - l + 1);
    }
}