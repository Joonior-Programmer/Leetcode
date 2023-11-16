class Solution {
    public String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int n = s.length();
        char[] sCharArray = s.toCharArray();
        
        while (i < n){
            if (i + 2 < n && sCharArray[i+2] == '#'){
                sb.append((char) (96 + (sCharArray[i] - 48) * 10 + sCharArray[i+1] - 48));
                i += 3;
            } else 
                sb.append((char) (96 + sCharArray[i++] - 48));
            
        }
        
        return sb.toString();
    }
}