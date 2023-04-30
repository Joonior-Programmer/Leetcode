class Solution {
    public String reverseWords(String s) {
        String[] splitted = s.split(" ");
        StringBuffer sb = new StringBuffer();
        StringBuffer temp = new StringBuffer();
        for (String v : splitted){
            temp.append(v);
            temp.reverse();
            sb.append(temp.toString() + " ");
            temp.setLength(0);
        }
        sb.setLength(sb.length() - 1);
        return sb.toString();
    }
}