class Solution {
    public String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();
        char[] temp = address.toCharArray();
        
        for (int i = 0; i < temp.length; ++i) {
            if (temp[i] != '.') sb.append(temp[i]);
            else sb.append("[.]");
        }
        
        return sb.toString();
    }
}