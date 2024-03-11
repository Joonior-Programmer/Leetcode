class Solution {
    public String customSortString(String order, String s) {
        int n = s.length();
        int[] count = new int[26];
        int i = 0;
        char[] ret = new char[n];
        
        for (int j = 0; j < n; ++j) ++count[s.charAt(j)-97];
        
        for (char v : order.toCharArray()){
            for (int j = 0; j < count[v-97]; ++j) ret[i++] = v;
            count[v-97] = 0;
        }
        
        for (int j = 0; j < 26; ++j){
            for (int k = 0; k < count[j]; ++k) ret[i++] = (char) (j + 97);
        }
        
        return new String(ret);
    }
}