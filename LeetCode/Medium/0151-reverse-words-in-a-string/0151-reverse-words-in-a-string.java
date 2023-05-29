class Solution {
    public String reverseWords(String s) {
        ArrayList<String> ret = new ArrayList<>();
        StringBuffer buffer = new StringBuffer();
        
        for (char v : s.toCharArray()){
            if (v != ' '){
                buffer.append(v);
            } else if (v == ' ' && buffer.length() != 0) {
                ret.add(buffer.toString());
                buffer.setLength(0);
            } 
        }
        
        if (buffer.length() != 0) ret.add(buffer.toString());
        
        Collections.reverse(ret);
        
        return String.join(" ", ret);
    }
}