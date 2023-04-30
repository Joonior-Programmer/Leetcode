class Solution {
    public String reverseWords(String s) {
        char[] sCharArray = s.toCharArray();
        int j = 0;
        char temp;
        int l;
        int r;
        for (int i = 1; i < sCharArray.length; ++i){
            if (sCharArray[i] == ' '){
                r = i - 1;
                l = j;
                while (l < r){
                    temp = sCharArray[l];
                    sCharArray[l] = sCharArray[r];
                    sCharArray[r] = temp;
                    ++l;
                    r--;
                }
                j = i + 1;
            }
        }
        
        r = sCharArray.length - 1;
        l = j;
        while (l < r){
            temp = sCharArray[l];
            sCharArray[l] = sCharArray[r];
            sCharArray[r] = temp;
            ++l;
            r--;
        }
        
        return new String(sCharArray);
    }
}