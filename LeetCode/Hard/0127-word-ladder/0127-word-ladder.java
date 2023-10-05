class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> words = new HashSet(wordList);
        
        if (!words.contains(endWord)) return 0;
        
        ArrayList<String> stack = new ArrayList();
        stack.add(beginWord);
        int idx = 0;
        int ret = 1;
        
        while (idx < stack.size()){
            int end = stack.size();
            ++ret;
            
            for (int i = idx; i < end; ++i){
                ++idx;
                char[] temp = stack.get(i).toCharArray();
                
                for (int j = 0; j < temp.length; ++j){
                    char tempChar = temp[j];
                    for (int k = 0; k < 26; ++k){
                        temp[j] = (char) ('a' + k);
                        String val = new String(temp);

                        if (words.contains(val)){
                            if (val.equals(endWord)) return ret;
                            stack.add(val);
                            words.remove(val);
                        }
                    }
                    temp[j] = tempChar;
                }
            }
        }
        
        return 0;
    }
}