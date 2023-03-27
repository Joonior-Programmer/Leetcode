class Solution {
    public char findTheDifference(String s, String t) {
        int[] counter = new int[26];
        char ret = 'a';
        for (char v : s.toCharArray()){
            ++counter[v - 'a'];
        }
        for (char v : t.toCharArray()){
            counter[v-'a']--;
        }
        for(int i = 0; i < counter.length; ++i){
            if (counter[i] != 0) {
                ret = (char) (i + 'a');
            }
        }
        return ret;
    }
}