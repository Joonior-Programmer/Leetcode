class Solution {
    public String decodeMessage(String key, String message) {
        int n = message.length();
        char[] decode = new char[26];
        int idx = 0;
        
        char[] keyArray = key.toCharArray();
        char[] messageArray = message.toCharArray();
        
        StringBuilder ret = new StringBuilder();
        
        for (char v : keyArray)
            if (v != ' ' && decode[v-97] == 0)
                decode[v-97] = (char) (97 + idx++);
            
        
        for (char v : messageArray)
            if (v != ' ') ret.append(decode[v-97]);
            else ret.append(' ');
        
        return ret.toString();
    }
}