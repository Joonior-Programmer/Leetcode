class Solution {
    public int maxVowels(String s, int k) {
        HashSet<Character> vowel = new HashSet();
        vowel.add('a');
        vowel.add('e');
        vowel.add('i');
        vowel.add('o');
        vowel.add('u');
        int ret = 0;
        int prev = 0;
        int temp = 0;
        char[] sCharArray = s.toCharArray();
        
        for (int i = 0; i < k; ++i){
            if (vowel.contains(sCharArray[i])) ++temp;
        }
        
        ret = temp;
        if (vowel.contains(sCharArray[prev++])) temp--;
        
        for (int i = k; i < sCharArray.length; ++i){
            if (vowel.contains(sCharArray[i])) ++temp;
            
            ret = Math.max(ret, temp);
            
            if (vowel.contains(sCharArray[prev++])) temp--;
        }
        
        return ret;
    }
}