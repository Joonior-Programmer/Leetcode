class Solution {
    public String frequencySort(String s) {
        int[] count = new int[128];
        int[] freq = new int[s.length() + 1];
        char[] ret = new char[s.length()];
        
        for (char v : s.toCharArray())
            ++count[v];
        
        for (int v : count)
            ++freq[v];
        
        int i = freq.length - 1;
        int idx = 0;
        
        while (i > 0){
            while (freq[i] > 0){
                for (int j = 0; j < 128; ++j){
                    if (count[j] == i){
                        for (int k = 0; k < i; ++k){
                            ret[idx++] = (char) j;
                        }

                        freq[i]--;
                    }
                }
            }
            i--;
            
        }

        return new String(ret);
    }
}