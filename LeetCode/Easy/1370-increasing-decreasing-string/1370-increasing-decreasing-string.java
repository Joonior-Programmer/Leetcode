class Solution {
    public String sortString(String s) {
        int[] count = new int[26];
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int l = 0, r = 25;

        for (char v : s.toCharArray())
            ++count[v-97];

        while (i < s.length()){
            while (l < r && count[l] == 0)
                ++l;
            
            sb.append((char) (l+97));
            ++i;
            count[l]--;

            for (int j = l + 1; j < r + 1; ++j){
                if (count[j] != 0){
                    count[j]--;
                    sb.append((char) (j+97));
                    ++i;
                }
            }
        
            if (i == s.length())
                break;

            while (r > l && count[r] == 0)
                r--;

            sb.append((char) (r+97));
            ++i;
            count[r]--;

            for (int j = r - 1; j > l - 1; j--){
                if (count[j] != 0){
                    count[j]--;
                    sb.append((char) (j+97));
                    ++i;
                }
            }
        }
        
        return sb.toString();
    }
}