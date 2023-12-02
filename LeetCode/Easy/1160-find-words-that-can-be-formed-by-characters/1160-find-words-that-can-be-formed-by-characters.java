class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] count = new int[26];
        int ret = 0;
        
        for (char v : chars.toCharArray()) ++count[v-'a'];
        
        for (String word : words){
            int[] countTemp = new int[26];
            boolean condition = true;
            
            for (char v : word.toCharArray()){
                int temp = v - 'a';
                ++countTemp[temp];
                if (countTemp[temp] > count[temp]) {
                    condition = false;
                    break;
                }
            }
            
            if (condition) ret += word.length();
        }
        
        return ret;
    }
}