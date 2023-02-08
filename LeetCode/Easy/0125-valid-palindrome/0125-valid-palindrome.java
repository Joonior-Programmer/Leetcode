class Solution {
    public boolean isPalindrome(String s) {
        String ret = "";
        for (int i = 0; i < s.length(); ++i){
            char temp = s.charAt(i);
            if ((temp > 96 && temp < 123) || (temp > 47 && temp < 58)){
                ret += temp;
            } else if (temp > 64 && temp < 91){

                ret += (char)(temp + 32);
            } 
        }
        StringBuffer buf = new StringBuffer(ret);
        String reversedRet = buf.reverse().toString();
        return ret.equals(reversedRet);
    }
}