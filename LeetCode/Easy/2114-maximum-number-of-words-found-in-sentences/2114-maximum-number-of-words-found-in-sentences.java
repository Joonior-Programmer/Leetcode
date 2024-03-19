class Solution {
    public int mostWordsFound(String[] sentences) {
        int ret = 0;
        
        for (String v : sentences) {
            int temp = 0;
            for (char c : v.toCharArray())
                if (c == ' ') ++temp;
            
            if (ret < temp) ret = temp;
        }

        return ret + 1;
    }
}