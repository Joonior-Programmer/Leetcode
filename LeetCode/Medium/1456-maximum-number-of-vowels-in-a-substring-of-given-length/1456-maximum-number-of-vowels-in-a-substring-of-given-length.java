class Solution {
    public int maxVowels(String s, int k) {
        int ret = 0;
        int prev = 0;
        int temp = 0;
        char[] sCharArray = s.toCharArray();
        
        for (int i = 0; i < k; ++i){
            if (sCharArray[i] == 'a' || sCharArray[i] == 'e' ||
               sCharArray[i] == 'o' || sCharArray[i] == 'i' || sCharArray[i] == 'u') ++temp;
        }
        
        ret = temp;
        if (sCharArray[prev] == 'a' || sCharArray[prev] == 'e' ||
               sCharArray[prev] == 'o' || sCharArray[prev] == 'i' || sCharArray[prev] == 'u') temp--;
        ++prev;
        for (int i = k; i < sCharArray.length; ++i){
            if (sCharArray[i] == 'a' || sCharArray[i] == 'e' ||
               sCharArray[i] == 'o' || sCharArray[i] == 'i' || sCharArray[i] == 'u') ++temp;
            
            ret = Math.max(ret, temp);
            
            if (sCharArray[prev] == 'a' || sCharArray[prev] == 'e' ||
               sCharArray[prev] == 'o' || sCharArray[prev] == 'i' || sCharArray[prev] == 'u') temp--;
            ++prev;
        }
        
        return ret;
    }
}