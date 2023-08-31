class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ret = new ArrayList();
        HashMap<String, List<String>> temp = new HashMap(); 
        for (int i = 0; i < strs.length; ++i){
            char[] temp_word = strs[i].toCharArray();
            Arrays.sort(temp_word);
            String word = new String(temp_word);
            
            if (!temp.containsKey(word)) temp.put(word, new ArrayList());
            temp.get(word).add(strs[i]);
        }

        
        temp.forEach((k, v) -> ret.add(v));
        return ret;
    }
}