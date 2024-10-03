class Solution {
    public String convertDateToBinary(String date) {
        String[] d = date.split("-");
        StringBuilder ret = new StringBuilder();
        
        ret.append(Integer.toBinaryString(Integer.parseInt(d[0])));
        ret.append("-");
        ret.append(Integer.toBinaryString(Integer.parseInt(d[1])));
        ret.append("-");
        ret.append(Integer.toBinaryString(Integer.parseInt(d[2])));

        return ret.toString();
    }
}