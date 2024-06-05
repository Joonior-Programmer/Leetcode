class Solution {
    public List<String> commonChars(String[] words) {
        int[] count = new int[26];
        List<String> ret = new ArrayList();
        
        for (int i = 0; i < 26; ++i) count[i] = 101;
        
        for (String word : words){
            int[] temp = new int[26];
            for (char v : word.toCharArray()) ++temp[v-97];
            
            for (int i = 0; i < 26; ++i) count[i] = Math.min(count[i], temp[i]);
        }
        
        for (int i = 0; i < 26; ++i)
            for (int j = 0; j < count[i]; ++j) ret.add(Character.toString(i+'a'));
        
        return ret;
    }
}