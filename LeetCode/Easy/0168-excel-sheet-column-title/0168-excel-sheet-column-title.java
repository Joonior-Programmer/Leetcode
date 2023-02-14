class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while (columnNumber != 0){
            columnNumber -= 1;
            sb.append((char) ((columnNumber % 26) + 65));
            columnNumber /= 26; 
        }
        return sb.reverse().toString();
    }
}