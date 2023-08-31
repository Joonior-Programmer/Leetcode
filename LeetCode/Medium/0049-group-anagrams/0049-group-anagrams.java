class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ret = new ArrayList();
        HashMap<String, List<String>> temp = new HashMap(); 
        
        for (int i = 0; i < strs.length; ++i){
            char[] temp_word = strs[i].toCharArray();
            char[] count = new char[26];
            for (int j = 0; j < temp_word.length; ++j) ++count[temp_word[j]-'a'];
            String word = new String(count);
            
            if (!temp.containsKey(word)) temp.put(word, new ArrayList());
            temp.get(word).add(strs[i]);
        }

        temp.forEach((k, v) -> ret.add(v));
        
        return ret;
    }
}