class Solution {
    public int compress(char[] chars) {
        char prev = '0';
        int prev_count = 0;
        int i = 0;
        int idx = 0;
        
        while (i < chars.length) {
            prev = chars[i];
            prev_count = 1;
            ++i;
            while (i < chars.length && prev == chars[i]) {
                ++i;
                ++prev_count;
            }
            
            chars[idx++] = prev;
            if (prev_count != 1) {
                for (char v : Integer.toString(prev_count).toCharArray()) chars[idx++] = v;
            }
        }
        
        return idx;
    }
}