class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> ret = new ArrayList();
        
        for (int i = 0; i < words.length; ++i){
            String word = words[i];
            
            for (int j = 0; j < word.length(); ++j)
                if (word.charAt(j) == x){
                    ret.add(i);
                    break;
                }
        }
        
        return ret;
    }
}